package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.Car;
import web.model.CarModel;

import java.util.List;

@Component
public class CarServiceImp implements CarService {


    @Override
    public List<Car> getCars(int count) {
        return CarModel.getCarList().subList(0, count);
    }
}
