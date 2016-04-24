package ua.artcode.taxi.dao;

import ua.artcode.taxi.model.Order;
import ua.artcode.taxi.model.User;

import java.util.ArrayList;
import java.util.List;

// operations in application
//to do - change orders to be stored in 2 tables - new, in progress, (ask about what we decide)
public class AppDB {

    private static int userIdCounter;
    private static int driverIdCounter;
    private static long orderIdCounter;
    private List<User> users;
    private List<Order> orders;
    private List<Drivers> drivers;

    public AppDB() {
        users = new ArrayList<>();
        orders = new ArrayList<>();
        drivers = new ArrayList<>();
    }

    public User addUser(User user){
        if (!(user instanceof User)) {
            throw new ClassFormatError("User should be added only!");
        }
        user.setId(userIdCounter++);
        users.add(user);
        return user;
    }

    //Check that Driver.class created
    public Driver addDriver(Driver driver){
        if (!(driver instanceof Driver)) {
            throw new ClassFormatError("Driver should be added only!");
        }
        driver.setId(driverIdCounter++);
        drivers.add(driver);
        return driver;
    }

    public User findUser(String phone){
        for (User user : users) {
            if(user.getPhone().equals(phone)){
                return user;
            }
        }
        return null;
    }

    public Driver findDriver(String phone){
        for (Driver driver : drivers) {
            if(driver.getPhone().equals(phone)){
                return user;
            }
        }
        return null;
    }

    public User findUserById(int id){
        for (User user : users) {
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public Driver findDriverByID(int id){
        for (Driver driver : driver) {
            if (driver.getId() == id) {
                return driver;
            }
        }
        return null;
    }

    public User deleteUser(int id){
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                return users.remove(i);
            }
        }
        return null;
    }

    public Driver deleteDriver(int id){
        for (int i = 0; i < drivers.size(); i++) {
            if (drivers.get(i).getId() == id) {
                return drivers.remove(i);
            }
        }
        return null;
    }

    public Order findOrder(long id){
        for (Order order : orders) {
            if(order.getId() == id){
                return order;
            }
        }
        return null;
    }

    public Order addOrder(Order order){
        order.setId(orderIdCounter++);
        orders.add(order);
        return order;
    }


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<User> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<User> drivers) {
        this.drivers = drivers;
    }
}
