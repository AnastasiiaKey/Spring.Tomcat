package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloCars {
    @GetMapping(value = "/cars")
    public String hellocars(@RequestParam(value = "count", defaultValue = "5") int amountOfCars, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Granta", "Fred", 456));
        list.add(new Car("Vesta", "Alex", 454));
        list.add(new Car("Kalina", "Victor", 789));
        list.add(new Car("Priora", "Kazbek", 393));
        list.add(new Car("Cross", "Dmitriy", 890));
        list = CarService.getCars(list, amountOfCars);
        model.addAttribute("list", list);
        return "cars";
    }
}
