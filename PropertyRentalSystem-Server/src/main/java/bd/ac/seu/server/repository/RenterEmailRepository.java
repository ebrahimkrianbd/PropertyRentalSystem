package bd.ac.seu.server.repository;

import bd.ac.seu.server.model.RenterEmail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenterEmailRepository extends CrudRepository<RenterEmail,String> {
}
