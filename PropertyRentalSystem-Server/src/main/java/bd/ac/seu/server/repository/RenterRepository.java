package bd.ac.seu.server.repository;

import bd.ac.seu.server.model.Renter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenterRepository extends CrudRepository<Renter,Long> {
}
