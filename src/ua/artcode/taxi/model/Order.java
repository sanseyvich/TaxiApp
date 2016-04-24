package ua.artcode.taxi.model;

import java.time.LocalDateTime;


public class Order {

    private long id;

    private Address from;

    private Address to;

    //how to calculate
    private double distance;

    private UserAbstract user;

    private UserAbstract driver;

    private int price;

    private LocalDateTime makeOrderTime;

    private OrderStatus orderStatus;

    public Order() {
    }

    public Order(Address from, Address to, User user) {
        this.from = from;
        this.to = to;
        this.user = user;

    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Address getFrom() {
        return from;
    }

    public void setFrom(Address from) {
        this.from = from;
    }

    public Address getTo() {
        return to;
    }

    public void setTo(Address to) {
        this.to = to;
    }

    public UserAbstract getUser() {
        return user;
    }

    public void setUser(UserAbstract user) {
        this.user = user;
    }

    public UserAbstract getDriver() {
        return driver;
    }

    public void setDriver(UserAbstract driver) {
        this.driver = driver;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getMakeOrderTime() {
        return makeOrderTime;
    }

    public void setMakeOrderTime(LocalDateTime makeOrderTime) {
        this.makeOrderTime = makeOrderTime;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", from=" + from +
                ", to=" + to +
                ", user=" + user +
                ", driver=" + driver +
                ", price=" + price +
                ", makeOrderTime=" + makeOrderTime +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
