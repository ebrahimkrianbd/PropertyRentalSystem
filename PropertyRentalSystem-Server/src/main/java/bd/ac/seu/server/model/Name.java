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
public class Name {
    @NotNull
    @Size(min = 4, max = 20)
    private String firstName;
    @Size(min = 4, max = 20)
    private String middleName;
    @Size(min = 4, max = 20)
    private String lastName;
}
