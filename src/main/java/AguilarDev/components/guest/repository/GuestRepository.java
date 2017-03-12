package AguilarDev.components.guest.repository;

import AguilarDev.components.guest.model.Guest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GuestRepository extends MongoRepository<Guest, String> {

}