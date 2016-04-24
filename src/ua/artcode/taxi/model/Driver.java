package ua.artcode.taxi.model;


import java.util.ArrayList;
import java.util.List;

public class Driver extends UserAbstract{

    private List<Car> cars = new ArrayList<Car>();
    private Order[] orders = new Order[2];
    private int ordersNum;

    public Driver(int id, String name, String phone, String pass) {
        setId(id);
        setName(name);
        setPhone(phone);
        setPass(pass);
    }

    public Order[] makeOrder(Order order){
        if (ordersNum < 2){
            orders[ordersNum] = order;
            return orders;
        }
        return null;
    }

    @Override
    public Order[] getCurrentOrder() {
        return orders;
    }

    public int getOrdersNum() {
        return ordersNum;
    }

    public void setOrdersNum(int ordersNum) {
        this.ordersNum = ordersNum;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }
}
