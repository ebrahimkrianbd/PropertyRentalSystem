package bd.ac.seu.client.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"staffEmailAddess"})
public class StaffEmail {
    private String staffEmailAddess;
    private Staff staff;
}
