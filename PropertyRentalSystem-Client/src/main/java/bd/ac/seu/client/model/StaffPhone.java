package bd.ac.seu.client.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"staffPhoneId"})
public class StaffPhone {
    int staffPhoneId;
    private Staff staff;
    private Phone phone;
    private String staffExtension;
}
