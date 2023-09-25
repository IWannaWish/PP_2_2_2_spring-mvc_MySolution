package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(1, "Honda", "Civic Type R"));
        cars.add(new Car(2, "Nissan", "GTR"));
        cars.add(new Car(3, "Infiniti", "Q60"));
        cars.add(new Car(4, "Audi", "A5"));
        cars.add(new Car(5, "Lexus", "NX300"));
    }


    @Override
    public List<Car> getCarList(int count) {
        if (count > 4) return cars;
        return cars.subList(0, count);
    }
}
