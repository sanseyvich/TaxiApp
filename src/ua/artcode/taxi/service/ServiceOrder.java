package ua.artcode.taxi.service;

import ua.artcode.taxi.utils.geolocation.GoogleMapsAPI;
import ua.artcode.taxi.utils.geolocation.GoogleMapsAPIImpl;
import ua.artcode.taxi.utils.geolocation.Location;


public class ServiceOrder {
    Location from;
    Location to;
    GoogleMapsAPI googleMapAPI = new GoogleMapsAPIImpl();

    public ServiceOrder() {

    }

    public ServiceOrder(Location from, Location to) {
        this.from = googleMapAPI.findLocation("Киев, улица Васильковская, 10");
        this.to = googleMapAPI.findLocation("Киев, ул. Попудренко, 20");
        //this.googleMapAPI = new GoogleMapsAPIImpl();

    }

    public double getDist () {
        return googleMapAPI.getDistance(from,to);
//        return -1;
    }

}

