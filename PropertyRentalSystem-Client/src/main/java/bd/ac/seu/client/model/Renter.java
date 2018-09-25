package bd.ac.seu.client.model;


import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"renterNumber"})
public class Renter {
    long renterNumber;
    private User user;
    private Address address;
    private Name name;
    private List<RentalAgreement> rentalAgreementList;
    private List<Viewing> viewingList;
    private List<RenterPhone> renterPhoneList;
    private List<RenterEmail> renterEmailList;
    private String rentarBusinessType;
}
