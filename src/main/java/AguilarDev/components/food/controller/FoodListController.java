package AguilarDev.components.food.controller;

import AguilarDev.components.food.model.FoodChoice;
import AguilarDev.components.guest.model.Guest;
import AguilarDev.components.guest.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/food-list")
public class FoodListController {

    @Autowired
    private GuestRepository guestRepo;

    @RequestMapping(method= RequestMethod.GET)
    public List<FoodChoice> getFoodCount(){
        List<Guest> guest = guestRepo.findAll();
        List<FoodChoice> food = guest.stream().map( getFood -> {
            return new FoodChoice(
                    getFood.getContactInfo().getFirstName(),
                    getFood.getContactInfo().getLastName(),
                    getFood.getMealChoice().stream().collect(toList()));
        }).collect(toList());

      return food;
    }

}
