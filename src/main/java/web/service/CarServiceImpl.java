package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(1, "Honda", "Civic Type R"));
        cars.add(new Car(2, "Nissan", "GTR"));
        cars.add(new Car(3, "Infinity", "Q35"));
        cars.add(new Car(4, "Audi", "A5"));
        cars.add(new Car(5, "Lexus", "NX300"));
    }


    @Override
    public List<Car> getCarList(int count) {
        if (count > 4) return cars;
        return cars.subList(0, count);
    }
}
