package bd.ac.seu.client.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"rentalEmailAddress"})
public class RenterEmail {
    private String rentalEmailAddress;
    private Renter renter;
}
