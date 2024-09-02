package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl extends CarService {

    private List<Car> cars = Arrays.asList(
            new Car("Toyota", 2020,"Red"),
            new Car("Ford", 2019, "Blue" ),
            new Car("BMW", 2021, "Black" ),
            new Car("Honda", 2018, "White" ),
            new Car("Chevrolet", 2022, "Green" )
    );

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5 || count <= 0) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
