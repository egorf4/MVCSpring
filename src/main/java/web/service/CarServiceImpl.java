package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("BMW", 2013, "black"));
        cars.add(new Car("Porsche", 2015, "red"));
        cars.add(new Car("Audi", 2017, "green"));
        cars.add(new Car("RR", 2021, "white"));
        cars.add(new Car("McLaren", 2019, "blue"));
    }

@Override
public List<Car> getCars(int count) {
    return cars
            .stream()
            .limit(count >= 5 ? Long.MAX_VALUE : count)
            .collect(Collectors.toList());
}
}
