package bd.ac.seu.client.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"renterPhoneId"})
public class RenterPhone {
    int renterPhoneId;
    private Renter renter;
    private Phone phone;
    private String renterExtension;
}
