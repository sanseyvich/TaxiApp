package ua.artcode.taxi.service;

import ua.artcode.taxi.exception.IllegalOperationWhithOrderException;
import ua.artcode.taxi.exception.OrderNotFoundException;
import ua.artcode.taxi.exception.RegisterException;
import ua.artcode.taxi.model.Message;
import ua.artcode.taxi.model.Order;
import ua.artcode.taxi.model.User;

import javax.security.auth.login.LoginException;
import java.util.List;


public interface ServiceUser {

    // return accessToken
    Message login(String phone, String pass) throws LoginException;

    Message register(User user) throws RegisterException;

    //    set staus CANCELED for Order
    Order cancelOrder(Order order, User user) throws OrderNotFoundException, IllegalOperationWhithOrderException;

    Order cancelOrder(long orderId, User user) throws OrderNotFoundException, IllegalOperationWhithOrderException;

    //    Message cancelCurrentOrder() throws OrderNotFoundException;
    List<Order> cancelCurrentOrder(User user) throws IllegalOperationWhithOrderException;

}
