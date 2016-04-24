package ua.artcode.taxi.service;

import ua.artcode.taxi.dao.UserDaoInnerDbImpl;
import ua.artcode.taxi.exception.IllegalOperationWhithOrderException;
import ua.artcode.taxi.exception.OrderMakeException;
import ua.artcode.taxi.exception.OrderNotFoundException;
import ua.artcode.taxi.exception.RegisterException;
import ua.artcode.taxi.model.*;

import javax.security.auth.login.LoginException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class UserServiceUserImpl implements ServiceUser {

    private UserDaoInnerDbImpl userDao;
    //String - accessKeysUser, User
    private Map<String, User> accessKeysUserMap = new HashMap<>();

    public UserServiceUserImpl(UserDaoInnerDbImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public String login(String phone, String pass) throws LoginException {
        User found = userDao.findByPhone(phone);

        if (found == null || !found.getPass().equals(pass)) {
            throw new LoginException("User not found or incorrect password");
        }

        String accessKey = UUID.randomUUID().toString();
//        accessKeysUser.add(accessKey);
        accessKeysUserMap.put(accessKey, found);

//        return new Message("Вход", "Вход выполнен успешно");
        return accessKey;
    }

    public Message logout(String accessKey) {
        //удалить из мапы
        return null;
    }

    @Override
    public Message register(User user) throws RegisterException {
        // validation user object(phone, login, pass)

        User created = userDao.create(user);

        if (created == null) {
            throw new RegisterException("can not create exception");
        }
//        return new Message("Регистрация", created.toString());
        return new Message("Регистрация", "Регистрация успешна");
    }

    @Override
    public Order cancelOrder(Order order, User user) throws OrderNotFoundException, IllegalOperationWhithOrderException {
        if (accessKeysUserMap.containsValue(user)) {
            if (order.getUser().getId() == user.getId()) {
                order.setOrderStatus(OrderStatus.CANCELLED);
            } else throw new OrderNotFoundException("Order not found");
        } else throw new IllegalOperationWhithOrderException("Нет прав на данную операцию");
        return order;
    }

    @Override
    public List<Order> cancelCurrentOrder(User user) throws IllegalOperationWhithOrderException {
        if (!(accessKeysUserMap.containsValue(user)))
            throw new IllegalOperationWhithOrderException("Нет прав на данную операцию");

        if (!(user.getCurrentOrder() == null)) {
            for (Order el : user.getCurrentOrder()) {
                if (!(el == null)) {
                    el.setOrderStatus(OrderStatus.CANCELLED);
                }
            }
        } else return null;

        return user.getCurrentOrder();
    }

    @Override
    public Order cancelOrder(long orderId, User user) throws OrderNotFoundException, IllegalOperationWhithOrderException {
        if (!(accessKeysUserMap.containsValue(user)))
            throw new IllegalOperationWhithOrderException("Нет прав на данную операцию");

//        if (user.g) throw new OrderNotFoundException("Не найден такой Order" + orderId);
        for (Order el : user.getCurrentOrder()) {
            if (el.getId() == orderId) {
                el.setOrderStatus(OrderStatus.CANCELLED);
                return el;
            }
        }
        return null;
    }


    public Order makeOrder(String accessToken, String from, String to) throws OrderMakeException {
        Address fromAddress = null;
        Address toAddress = null;
        User user = null;
        Order order = null;

        String stringAddress[] = from.split(",");
        fromAddress = new Address(stringAddress[0], stringAddress[1], stringAddress[2]);

        String stringtoAddress[] = to.split(",");
        toAddress = new Address(stringtoAddress[0], stringtoAddress[1], stringtoAddress[2]);

        if (accessKeysUserMap.containsKey(accessToken)) {
            user = (User) accessKeysUserMap.get(accessToken);
            order = new Order(fromAddress, toAddress, user);
            order.setDistance(new ServiceOrder().getDist() );
            System.out.printf("Расстояние = " + order.getDistance());
            user.getCurrentOrder().add(order);
        }

        return order;
    }

    public Order makeOrderAnonymous(String phone, String from, String to) throws OrderMakeException {
        return null;
    }
}
