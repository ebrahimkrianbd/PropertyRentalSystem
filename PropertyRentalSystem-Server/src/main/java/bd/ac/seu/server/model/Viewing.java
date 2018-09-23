package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Viewing {
    @NotNull
    @Id
    @GeneratedValue
    int viewingId;
    @NotNull
    @ManyToOne
    private Property property;
    @ManyToOne
    @NotNull
    private Renter renter;
    @NotNull
    @DateTimeFormat
    LocalDate viewingDate;
}
