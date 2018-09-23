package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class StaffPhone {
    @Id
    @GeneratedValue
    int staffPhoneId;
    @ManyToOne
    private Staff staff;
    @Embedded
    private Phone phone;
    private String staffExtension;

}
