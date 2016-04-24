package ua.artcode.taxi.model;

/**
 * Created by Lelouch on 24.04.2016.
 */
public class Car {

    private String type;
    private String model;
    private String number;
    private String color;


    public Car(String type, String model, String number, String color) {
        this.type = type;
        this.model = model;
        this.number = number;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", number='" + number + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (type != null ? !type.equals(car.type) : car.type != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (number != null ? !number.equals(car.number) : car.number != null) return false;
        return color != null ? color.equals(car.color) : car.color == null;

    }


}
