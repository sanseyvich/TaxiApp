package ua.artcode.taxi.service;

import ua.artcode.taxi.exception.OrderNotFoundException;
import ua.artcode.taxi.exception.RegisterException;
import ua.artcode.taxi.model.Message;
import ua.artcode.taxi.model.User;

import javax.security.auth.login.LoginException;


public interface Service {

    // return accessToken
    String login(String phone, String pass) throws LoginException;

    Message register(User user) throws RegisterException;

    Message cancelOrder(long orderId) throws OrderNotFoundException;


   /* Order submitOrder(Order order) throws OrderMakeException;

    Order getInfo(long orderId) throws OrderNotFoundException;
*/

}
