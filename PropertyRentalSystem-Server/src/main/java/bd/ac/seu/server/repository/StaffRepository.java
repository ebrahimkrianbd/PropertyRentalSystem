package bd.ac.seu.server.repository;

import bd.ac.seu.server.model.Staff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StaffRepository extends CrudRepository<Staff,Long> {

}
