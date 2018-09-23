package bd.ac.seu.server.repository;

import bd.ac.seu.server.model.StaffPhone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffPhoneRepository extends CrudRepository<StaffPhone,Integer> {
}
