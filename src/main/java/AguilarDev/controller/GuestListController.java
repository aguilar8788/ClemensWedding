package AguilarDev.controller;

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

//    @RequestMapping("/guest")
//    public Guest guest(@RequestParam("id") String id) {
//        return new Guest(id, null, 1, null, null);
//    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Guest> getAll() {
        return guestRepo.findAll();
    }

    @RequestMapping(method=RequestMethod.POST)
    public work create(@RequestBody work work) {
        return repo.save(work);
    }
}
