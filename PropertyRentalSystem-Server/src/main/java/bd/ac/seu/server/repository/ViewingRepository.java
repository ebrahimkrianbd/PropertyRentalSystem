package bd.ac.seu.server.repository;

import bd.ac.seu.server.model.Viewing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewingRepository extends CrudRepository<Viewing, Integer> {
}
