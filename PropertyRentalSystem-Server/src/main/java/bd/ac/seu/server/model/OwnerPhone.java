package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

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
    private Phone phone;
    @NotNull
    private String ownerExtension;
}
