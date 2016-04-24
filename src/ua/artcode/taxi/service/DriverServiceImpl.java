package ua.artcode.taxi.service;

import ua.artcode.taxi.exception.OrderMakeException;
import ua.artcode.taxi.exception.OrderNotFoundException;
import ua.artcode.taxi.exception.RegisterException;
import ua.artcode.taxi.model.Message;
import ua.artcode.taxi.model.Order;
import ua.artcode.taxi.model.User;

import javax.security.auth.login.LoginException;

/**
 * Created by olsas on 4/23/2016.
 */
public class DriverServiceImpl implements Service{

    @Override
    public Message register(User user) throws RegisterException {
        return null;
    }

    @Override
    public String login(String phone, String pass) throws LoginException {
        return null;
    }

    @Override
    public Order submitOrder(Order order) throws OrderMakeException {
        return null;
    }

    @Override
    public Order getInfo(long orderId) throws OrderNotFoundException {
        return null;
    }

    @Override
    public Message cancelOrder(long orderId) throws OrderNotFoundException {
        return null;
    }

    //public
}
