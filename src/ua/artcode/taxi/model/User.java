package ua.artcode.taxi.model;


import java.util.LinkedList;
import java.util.List;

public class User extends UserAbstract {



    private List<Order> historyUserOrders = new LinkedList<>();

    private List<Order> orders = new LinkedList<>();

    public List<Order> getHistoryUserOrders() {
        return historyUserOrders;
    }

    public void setHistoryUserOrders(List<Order> historyUserOrders) {
        this.historyUserOrders = historyUserOrders;
    }

    public List<Order> getCurrentOrder() {
        return orders;
    }

    public void setCurrentOrder(List<Order> orders) {
        this.orders = orders;
    }
}
