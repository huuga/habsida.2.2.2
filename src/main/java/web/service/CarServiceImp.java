package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.model.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class CarServiceImp implements CarService{
    @Override
    public List<Car> getCarsList(int count) {
        String[] brands = new String[] {"Toyota", "Nissan", "Mitsubishi"};
        String[] models = new String[] {"Camry", "Land Cruiser", "Juke", "Pajero", "Patrol"};
        Color[] colors = Color.values();
        Random rand = new Random();
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            cars.add(new Car(brands[rand.nextInt(brands.length)],
                                models[rand.nextInt(models.length)],
                                colors[rand.nextInt(colors.length)]));
        }
        return cars;
    }
}
