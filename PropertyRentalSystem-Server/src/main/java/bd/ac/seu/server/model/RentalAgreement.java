package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class RentalAgreement {
    @Id
    private long rentalNumber;
    @ManyToOne
    private Property property;
    @ManyToOne
    private Renter renter;
    private LocalDate signningDate;
    private LocalDate startingDate;
    private LocalDate EndingDate;

}
