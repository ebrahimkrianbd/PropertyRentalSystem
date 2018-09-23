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
public class OwnerPhone {
    @Id
    @GeneratedValue
    int ownerPhoneId;
    @ManyToOne
    private Owner owner;
    @Embedded
    private Phone phone;
    private String ownerExtension;
}
