package bd.ac.seu.server.repository;

import bd.ac.seu.server.model.RentalAgreement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalAgreementRepository extends CrudRepository<RentalAgreement,Long> {
}
