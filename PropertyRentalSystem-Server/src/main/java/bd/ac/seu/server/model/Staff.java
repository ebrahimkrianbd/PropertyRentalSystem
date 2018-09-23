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
public class Staff {
    @Id
    private long staffNumber;
    @ManyToOne
    private Branch branch;
    @OneToMany
    private List<Property> propertyList;
    @OneToMany
    private List<StaffPhone> staffPhoneList;
    @OneToMany
    private List<StaffEmail> staffEmailList;
    @Embedded
    private Name name;
    @Embedded
    private Address address;
    private double Salary;
    @Enumerated
    private Gender gender;
}
