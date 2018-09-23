package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class RenterPhone {
    long rentarNumber;
    Phone phone;
    String renterExtension;
    ....
}
