package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private int year;
    private String color;
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String
    toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    public List<Car> carList() {
        Car car1 = new Car("BMW",3,"black");
        Car car2 = new Car("Porsche",5,"red");
        Car car3 = new Car("Audi",7,"green");
        Car car4 = new Car("RR",11,"white");
        Car car5 = new Car("McLaren",9,"blue");
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        return carList;
    }
}
