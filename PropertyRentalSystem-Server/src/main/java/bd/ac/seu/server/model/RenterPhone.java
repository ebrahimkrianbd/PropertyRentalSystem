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
public class RenterPhone {
    @Id
    @GeneratedValue
    int renterPhoneId;
    @ManyToOne
    private Renter renter;
    @Embedded
    private Phone phone;
    private String renterExtension;
}
