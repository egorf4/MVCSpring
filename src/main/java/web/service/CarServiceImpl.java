package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

@Override
public List<Car> getCars(int count) {
    return new Car().carList()
            .stream()
            .limit(count >= 5 ? Long.MAX_VALUE : count)
            .toList();
}
}
