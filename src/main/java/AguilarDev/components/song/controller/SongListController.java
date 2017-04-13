package AguilarDev.components.song.controller;

import AguilarDev.components.guest.model.Guest;
import AguilarDev.components.guest.repository.GuestRepository;
import AguilarDev.components.song.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toCollection;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
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

    @RequestMapping(method=RequestMethod.GET, value="{song}")
    public ResponseEntity<String> findSong(@PathVariable String song) {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(
                "https://itunes.apple.com/search?term=" + song,
                String.class);

        System.out.println(response);
        return response;
    }


}
