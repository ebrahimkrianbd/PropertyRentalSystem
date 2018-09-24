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
public class Staff {
    @NotNull
    @Id
    private long staffNumber;

    @OneToOne
    private User user;

    @NotNull
    @ManyToOne
    private Branch branch;

    @NotNull
    @OneToMany
    private List<Property> propertyList;

    @NotNull
    @OneToMany
    private List<StaffPhone> staffPhoneList;

    @NotNull
    @OneToMany
    private List<StaffEmail> staffEmailList;

    @NotNull
    @Embedded
    private Name name;

    @NotNull
    @Embedded
    private Address address;

    @NotNull
    private double Salary;

    @NotNull
    @Enumerated
    private Gender gender;
}
