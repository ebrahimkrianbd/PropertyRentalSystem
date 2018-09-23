package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Renter {
    @Id
    long renterNumber;
    @Embedded
    Address address;
    @Embedded
    Name name;
    @OneToMany
    private List<RentalAgreement> rentalAgreementList;
    @OneToMany
    private List<Viewing> viewingList;
    @OneToMany
    private List<RenterPhone> renterPhoneList;
    @OneToMany
    private List<RenterEmail> renterEmailList;
    String rentarBusinessType;
}
