package bd.ac.seu.client.model;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"staffNumber"})
public class Staff {
    private long staffNumber;
    private User user;
    private Branch branch;
    private Name name;
    private List<Property> propertyList;
    private List<StaffPhone> staffPhoneList;
    private List<StaffEmail> staffEmailList;
    private Address address;
    private double Salary;
    private Gender gender;
}
