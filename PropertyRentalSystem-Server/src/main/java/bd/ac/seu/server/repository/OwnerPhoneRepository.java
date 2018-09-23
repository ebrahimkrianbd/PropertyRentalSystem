package bd.ac.seu.server.repository;

import bd.ac.seu.server.model.OwnerPhone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerPhoneRepository extends CrudRepository<OwnerPhone,Integer> {
}
