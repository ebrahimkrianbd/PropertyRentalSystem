package bd.ac.seu.server.repository;

import bd.ac.seu.server.model.Advertisement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertisementRepository extends CrudRepository<Advertisement,Long> {
}
