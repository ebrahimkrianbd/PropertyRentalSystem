package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Property {
    @Id
    private long propertyNumber;
    @Embedded
    private Address address;
    @OneToMany
    private List<Advertisement> advertisementList;
    @OneToMany
    private List<Viewing> viewingList;
    @ManyToOne
    private Owner owner;
    @ManyToOne
    private Staff staff;
}
