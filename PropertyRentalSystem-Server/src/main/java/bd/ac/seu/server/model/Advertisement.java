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
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class Advertisement {
    @Id
    private long  advertisementNumber;
    @ManyToOne
    private Newspaper newspaperName;
    @ManyToOne
    private Property property;
    private LocalDate advertisementDate;


}
