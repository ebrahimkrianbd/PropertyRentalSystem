package bd.ac.seu.server.service;

import bd.ac.seu.server.model.RentalAgreement;
import bd.ac.seu.server.repository.RentalAgreementRepository;

public class RentalAgreementService {
    private RentalAgreementRepository rentalAgreementRepository;

    public RentalAgreementService(RentalAgreementRepository rentalAgreementRepository) {
        this.rentalAgreementRepository = rentalAgreementRepository;
    }

    public RentalAgreement createRentalAgreement(RentalAgreement rentalAgreement) {
        return rentalAgreementRepository.save(rentalAgreement);
    }
}
