package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarServiceImp carServiceImp;
    private static final int MAX_COUNT = 5;


    @GetMapping(value = "/cars")
    public String printCars(@ModelAttribute("count") String count, Model model) {

        List<Car> cars = null;

        if (count.equals("")) {
            cars = carServiceImp.getCarsList(MAX_COUNT);
            model.addAttribute("carsList", cars);
        }
        else {
            try {
                int intCount = Integer.parseInt(count);
                if (intCount > 5) {
                    cars = carServiceImp.getCarsList(MAX_COUNT);
                } else {
                    cars = carServiceImp.getCarsList(intCount);
                }
                model.addAttribute("carsList", cars);
            } catch (NumberFormatException nfe) {
                return "400";
            }
        }
        return "cars";
    }
}
