package inholland.classicCarsapi.controller;

import inholland.classicCarsapi.model.Car;
import inholland.classicCarsapi.service.CarService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "cars", produces = MediaType.APPLICATION_JSON_VALUE)
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> allCars() {
        return carService.allCars();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable int id) {
        return carService.getCarById(id);
    }

    @PostMapping
    public Car addCar(@RequestBody Car car) {
        return carService.addCar(car);
    }

    @PutMapping("/{id}")
    public Car updateCar(@PathVariable int id, @RequestBody Car car) {
        return carService.updateCar(id, car);
    }

    @DeleteMapping("/{id}")
    public Car deleteCar(@PathVariable int id) {
        return carService.deleteCar(id);
    }
}
