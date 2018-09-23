package bd.ac.seu.server.repository;

import bd.ac.seu.server.model.StaffEmail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffEmailRepository extends CrudRepository<StaffEmail,String> {
}
