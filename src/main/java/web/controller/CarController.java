package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    @RequestMapping("/cars")
    public String showCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        CarServiceImpl carService = new CarServiceImpl();
        List<Car> carsList = carService.getCars(count);
        model.addAttribute("carsList", carsList);
        return "cars";
    }
}

