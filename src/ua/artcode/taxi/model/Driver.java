package ua.artcode.taxi.model;


import java.util.LinkedList;
import java.util.List;

public class Driver extends UserAbstract{

    private List<Order> history = new LinkedList<>();

    private List<Car> cars = new LinkedList<>();

    private Car carDriverNow;

    private Order order;

    public Car getCarDriverNow() {
        return carDriverNow;
    }

    public void setCarDriverNow(Car carDriverNow) {
        this.carDriverNow = carDriverNow;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Order> getHistory() {
        return history;
    }

    public void setHistory(List<Order> history) {
        this.history = history;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
