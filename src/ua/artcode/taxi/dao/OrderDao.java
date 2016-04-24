package ua.artcode.taxi.dao;

import ua.artcode.taxi.model.Order;

import java.util.Collection;

/**
 * Created by olsas on 4/24/2016.
 */
public class OrderDao {
    Order create(Order order);

    Order delete(int id);

    Order update(Order order);

    Collection<Order> getAll();

    Collection<Order> getNewOrders();

    T findById(int id);


}
