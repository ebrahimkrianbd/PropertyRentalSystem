package bd.ac.seu.client.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {
    private String streetNumber;
    private String streetName;
    private String city;
    private String province;
    private String postalCode;
}
