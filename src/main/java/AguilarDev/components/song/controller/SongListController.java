package AguilarDev.components.song.controller;

import AguilarDev.components.guest.model.Guest;
import AguilarDev.components.guest.repository.GuestRepository;
import AguilarDev.components.song.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toCollection;

@RestController
@RequestMapping("/song-list")
public class SongListController {

    @Autowired
    private GuestRepository guestRepo;

    @RequestMapping(method= RequestMethod.GET)
    public Set<Song> getSongList(){
        List<Guest> guest = guestRepo.findAll();
        Set<Song> songs = guest.stream().map( getRequests -> getRequests.getSongRequests().stream())
                .flatMap(reduce -> reduce).collect(toCollection(HashSet::new));

        return songs;
    }


}
