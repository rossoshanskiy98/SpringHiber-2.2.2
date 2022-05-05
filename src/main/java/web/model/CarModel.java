package web.model;

import web.Car;

import java.util.ArrayList;
import java.util.List;

public class CarModel {

    public static List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Lada", "Grey", 6));
        carList.add(new Car("Kia", "Orange", 4));
        carList.add(new Car("BMW", "White", 14));
        carList.add(new Car("Mercedes", "Black", 2));
        carList.add(new Car("Porsche", "Yellow", 1));
        return carList;
    }
}
