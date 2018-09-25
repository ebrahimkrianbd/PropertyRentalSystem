package bd.ac.seu.client.model;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"branchNumber"})
public class Branch {
    private long branchNumber;
    private List<Staff> staffList;
    private Address address;
    private String TypeOfStaff;
}
