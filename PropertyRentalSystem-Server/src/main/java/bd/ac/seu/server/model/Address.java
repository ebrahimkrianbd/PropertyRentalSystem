package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class Address {
    String streetNumber;
    String streetName;
    String city;
    String province;
    String postalCode;
}
