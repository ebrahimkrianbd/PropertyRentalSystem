package bd.ac.seu.client.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;
}
