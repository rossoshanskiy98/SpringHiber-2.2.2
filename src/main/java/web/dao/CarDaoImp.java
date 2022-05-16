package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {
    @Override
    public List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Lada", "Grey", 6));
        carList.add(new Car("Kia", "Orange", 4));
        carList.add(new Car("BMW", "White", 14));
        carList.add(new Car("Mercedes", "Black", 2));
        carList.add(new Car("Porsche", "Yellow", 1));
        return carList;
    }
}
