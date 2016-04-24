package ua.artcode.taxi.service;

import ua.artcode.taxi.exception.IllegalOperationWhithOrderException;
import ua.artcode.taxi.exception.OrderMakeException;
import ua.artcode.taxi.exception.OrderNotFoundException;
import ua.artcode.taxi.exception.RegisterException;
import ua.artcode.taxi.model.Message;
import ua.artcode.taxi.model.Order;
import ua.artcode.taxi.model.User;

import javax.security.auth.login.LoginException;


public class DriverServiceUserImpl implements ServiceUser {
    @Override
    public Message login(String phone, String pass) throws LoginException {
        return null;
    }

    @Override
    public Message register(User user) throws RegisterException {
        return null;
    }

    @Override
    public Order cancelOrder(Order order, User user) throws OrderNotFoundException, IllegalOperationWhithOrderException {
        return null;
    }

    @Override
    public Order cancelOrder(long orderId, User user) throws OrderNotFoundException, IllegalOperationWhithOrderException {
        return null;
    }

    @Override
    public Order[] cancelCurrentOrder(User user) throws IllegalOperationWhithOrderException {
        return new Order[0];
    }
//public
}