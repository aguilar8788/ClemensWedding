package AguilarDev.components.contactInfo.repository;

import AguilarDev.components.contactInfo.model.ContactInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactInfoRepository extends MongoRepository<ContactInfo, String> {

}