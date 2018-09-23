package bd.ac.seu.server.repository;

import bd.ac.seu.server.model.BranchEmail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchEmailRepository extends CrudRepository<BranchEmail,String> {
}
