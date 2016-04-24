package ua.artcode.taxi.service;

import ua.artcode.taxi.exception.OrderMakeException;
import ua.artcode.taxi.exception.OrderNotFoundException;
import ua.artcode.taxi.exception.RegisterException;
import ua.artcode.taxi.model.Message;
import ua.artcode.taxi.model.Order;
import ua.artcode.taxi.model.User;

import javax.security.auth.login.LoginException;

/**
 * Created by serhii on 23.04.16.
 */
public interface Service {

    Message register(User user) throws RegisterException;

    // return accessToken
    String login(String phone, String pass) throws LoginException;

    Order submitOrder(Order order) throws OrderMakeException;

    Order getInfo(long orderId) throws OrderNotFoundException;

    Message cancelOrder(long orderId) throws OrderNotFoundException;



}
