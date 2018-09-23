package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@ToString
@Embeddable
public class Address {
    @NotNull
    private String streetNumber;
    @NotNull
    private String streetName;
    @NotNull
    private String city;
    @NotNull
    private String province;
    @NotNull
    private String postalCode;
}
