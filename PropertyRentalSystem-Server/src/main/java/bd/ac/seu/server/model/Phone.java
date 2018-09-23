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
public class Phone {
    @NotNull
    private String areaCode;
    @NotNull
    private String phoneNumber;
}
