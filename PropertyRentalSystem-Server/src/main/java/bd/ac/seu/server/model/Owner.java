package bd.ac.seu.server.model;

import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Owner {
    @Id
    private long ownerNubmer;
    @Embedded
    private Name name;
    @Embedded
    private Address address;
    private long businessType;
    @OneToMany
    private List<OwnerPhone> ownerPhoneList;
    @OneToMany
    private List<OwnerEmail> ownerEmailList;
}
