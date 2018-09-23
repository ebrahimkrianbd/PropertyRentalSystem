package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class Branch {
    @Id
    private long branchNumber;
    @OneToMany
    private List<Staff> staffList;
    @Embedded
    private Address address;
    private Staff brachManger;

}
