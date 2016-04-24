package ua.artcode.taxi.model;


import java.util.LinkedList;
import java.util.List;

public class Driver extends UserAbstract{

    private List<Car> cars = new LinkedList<>();

    private Car carDriverNow;

    private Order order;

    private int ordersNum;

    private boolean orderStatusFree = true;


}
