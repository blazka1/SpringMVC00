package web.service;

import web.model.Car;
import java.util.List;

public abstract class CarService {
    public abstract List<Car> getCars(int count);
}
