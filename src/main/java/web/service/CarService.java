package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public static List<Car> getCars (List<Car> list, int howManyCars) {
        if (howManyCars ==0 || howManyCars > 5) return list;
        return list.stream().limit(howManyCars).collect(Collectors.toList());
    }
}
