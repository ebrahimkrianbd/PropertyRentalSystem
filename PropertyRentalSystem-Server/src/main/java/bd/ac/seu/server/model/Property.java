package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@ToString
@Entity
public class Property {
    @NotNull
    @Id
    private long propertyNumber;
    @NotNull
    @Embedded
    private Address address;
    @NotNull
    @OneToMany
    private List<Advertisement> advertisementList;
    @NotNull
    @OneToMany
    private List<Viewing> viewingList;
    @NotNull
    @ManyToOne
    private Owner owner;
    @NotNull
    @ManyToOne
    private Staff staff;
}
