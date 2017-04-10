package AguilarDev.components.guest.controller;

import AguilarDev.components.guest.model.Guest;
import AguilarDev.components.guest.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guest")
public class GuestListController {

    @Autowired
    private GuestRepository guestRepo;

    @RequestMapping(method= RequestMethod.GET)
    public List<Guest> getAll() {


        return guestRepo.findAll();
    }

    @RequestMapping(method=RequestMethod.POST)
    public Guest create(@RequestBody Guest guest) {
        return guestRepo.save(guest);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="{id}")
    public List<Guest> delete(@PathVariable String id) {
        guestRepo.delete(id);
        return guestRepo.findAll();
    }

    @RequestMapping(method=RequestMethod.PUT, value="{id}")
    public Guest update(@PathVariable String id, @RequestBody Guest guest) {
        Guest update = guestRepo.findOne(id);

        update.setContactInfo(guest.getContactInfo());
        update.setAttending(guest.getAttending());
        update.setNumberOfAttending(guest.getNumberOfAttending());
        update.setMealChoice(guest.getMealChoice());
        update.setSongRequests(guest.getSongRequests());

        return guestRepo.save(update);
    }
}
