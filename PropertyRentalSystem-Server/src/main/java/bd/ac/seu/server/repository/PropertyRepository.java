package bd.ac.seu.server.repository;

import bd.ac.seu.server.model.Property;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends CrudRepository<Property,Long> {
}
