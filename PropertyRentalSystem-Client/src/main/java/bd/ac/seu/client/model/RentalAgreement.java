package bd.ac.seu.client.model;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"rentalNumber"})
public class RentalAgreement {
    private long rentalNumber;
    private Property property;
    private Renter renter;
    private LocalDate signningDate;
    private LocalDate startingDate;
    private LocalDate EndingDate;
}
