package bd.ac.seu.server.repository;

import bd.ac.seu.server.model.OwnerEmail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerEmailRepository extends CrudRepository<OwnerEmail,String> {
}
