package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@ToString
@Entity
public class OwnerPhone {
    @NotNull
    @Id
    @GeneratedValue
    int ownerPhoneId;
    @NotNull
    @ManyToOne
    private Owner owner;
    @NotNull
    @Embedded
    @UniqueElements
    private Phone phone;
    @NotNull
    private String ownerExtension;
}
