package ua.artcode.taxi.model;


public class User extends UserAbstract {

    private Order[] orders = new Order[4];


    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

}
