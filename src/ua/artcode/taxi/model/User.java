package ua.artcode.taxi.model;


import java.util.LinkedList;
import java.util.List;

public class User extends UserAbstract {

    private List<Order> orders = new LinkedList<>();

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
