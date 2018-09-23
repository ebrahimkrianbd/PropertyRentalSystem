package bd.ac.seu.server.repository;

import bd.ac.seu.server.model.RenterPhone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenterPhoneRepository extends CrudRepository<RenterPhone, Integer> {
}
