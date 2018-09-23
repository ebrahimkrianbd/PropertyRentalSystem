package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@ToString
@Entity
public class RentalAgreement {
    @NotNull
    @Id
    private long rentalNumber;
    @NotNull
    @ManyToOne
    private Property property;
    @NotNull
    @ManyToOne
    private Renter renter;
    @NotNull
    @DateTimeFormat
    private LocalDate signningDate;
    @NotNull
    @DateTimeFormat
    private LocalDate startingDate;
    @NotNull
    @DateTimeFormat
    private LocalDate EndingDate;

}
