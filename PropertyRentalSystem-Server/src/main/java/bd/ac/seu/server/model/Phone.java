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
public class Phone {
    @NotNull
    @Size(min = 1, max=5)
    private String areaCode;
    @NotNull
    @Size(min = 6, max=15)
    private String phoneNumber;
}
