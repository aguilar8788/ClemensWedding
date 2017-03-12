package AguilarDev.components.streetAddress.repository;

import AguilarDev.components.streetAddress.model.StreetAddress;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StreetAddressRepository extends MongoRepository<StreetAddress, String> {

}