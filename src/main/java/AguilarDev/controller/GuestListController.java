package AguilarDev.controller;

import AguilarDev.components.contactInfo.model.ContactInfo;
import AguilarDev.components.contactInfo.repository.ContactInfoRepository;
import AguilarDev.components.streetAddress.model.StreetAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guest")
public class GuestListController {

    @Autowired
    private ContactInfoRepository contactRepo;

    @RequestMapping(method= RequestMethod.GET)
    public List<ContactInfo> getAll() {
        return contactRepo.findAll();
    }

    @RequestMapping(method=RequestMethod.POST)
    public ContactInfo create(@RequestBody ContactInfo contactInfo) {
        return contactRepo.save(contactInfo);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="{id}")
    public List<ContactInfo> delete(@PathVariable String id) {
        contactRepo.delete(id);
        return contactRepo.findAll();
    }

    @RequestMapping(method=RequestMethod.PUT, value="{id}")
    public ContactInfo update(@PathVariable String id, @RequestBody ContactInfo contactInfo) {
        ContactInfo update = contactRepo.findOne(id);
        update.setFirstName(contactInfo.getFirstName());
        update.setLastName(contactInfo.getLastName());
        update.setEmailAddress(contactInfo.getEmailAddress());
        update.setPhoneNumber(contactInfo.getPhoneNumber());
        update.setStreetAddress(new StreetAddress(
                contactInfo.getStreetAddress().getLine1(),
                contactInfo.getStreetAddress().getLine2(),
                contactInfo.getStreetAddress().getCity(),
                contactInfo.getStreetAddress().getState(),
                contactInfo.getStreetAddress().getZip()
        ));
        return contactRepo.save(update);
    }
}
