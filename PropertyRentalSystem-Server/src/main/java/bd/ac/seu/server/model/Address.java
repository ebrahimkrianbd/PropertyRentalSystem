package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@ToString
@Embeddable
public class Address {
    @NotNull
    @Size(min = 3, max = 20)
    private String streetNumber;
    @NotNull
    @Size(min = 3, max = 20)
    private String streetName;
    @NotNull
    @Size(min = 3, max = 20)
    private String city;
    @NotNull
    @Size(min = 3, max = 20)
    private String province;
    @NotNull
    @Size(min = 3, max = 10)
    private String postalCode;
}
