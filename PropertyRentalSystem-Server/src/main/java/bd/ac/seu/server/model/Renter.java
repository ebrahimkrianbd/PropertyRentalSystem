package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Renter {
    @NotNull
    @Id
    long renterNumber;

    @OneToOne
    private User user;

    @NotNull
    @Embedded
    Address address;

    @NotNull
    @Embedded
    Name name;

    @OneToMany
    @NotNull
    private List<RentalAgreement> rentalAgreementList;

    @OneToMany
    @NotNull
    private List<Viewing> viewingList;

    @OneToMany
    @NotNull
    private List<RenterPhone> renterPhoneList;

    @OneToMany
    @NotNull
    private List<RenterEmail> renterEmailList;

    @NotNull
    String rentarBusinessType;
}
