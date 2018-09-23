package bd.ac.seu.server.repository;

import bd.ac.seu.server.model.Newspaper;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewspaperRepository extends CrudRepository<Newspaper,String> {
}
