package AguilarDev.components.song.repository;

import AguilarDev.components.song.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SongRepository extends MongoRepository<Song, String> {

}