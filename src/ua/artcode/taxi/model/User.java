package ua.artcode.taxi.model;


public class User extends UserAbstract {

    private Order[] orders = new Order[4];


    public Order[] getCurrentOrder() {
        return orders;
    }

    public void setCurrentOrder(Order[] orders) {
        this.orders = orders;
    }

}
