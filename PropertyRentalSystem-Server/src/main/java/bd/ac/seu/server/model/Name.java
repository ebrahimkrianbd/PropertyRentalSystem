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
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;
}
