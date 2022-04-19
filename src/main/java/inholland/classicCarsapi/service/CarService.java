package inholland.classicCarsapi.service;


import inholland.classicCarsapi.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars;
    private int id = 3;

    public CarService(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> allCars() {
        return cars;
    }

    public Car getCarById(int id) {
        return cars.get(id);
    }

    public Car addCar(Car car) {
        id += 1;
        car.setId(id);
        cars.add(id, car);
        return car;
    }

    public Car updateCar(int id, Car car) {
        Car c = getCarById(id);
        c.setBrand(car.getBrand());
        c.setModel(car.getModel());
        c.setRelease(car.getRelease());
        return c;
    }

    public Car deleteCar(int id) {
        return cars.remove(id);
    }
}
