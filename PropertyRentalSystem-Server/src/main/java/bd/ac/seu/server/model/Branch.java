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
public class Branch {
    @NotNull
    @Id
    private long branchNumber;
    @OneToMany
    private List<Staff> staffList;
    @NotNull
    @Embedded
    private Address address;
    @NotNull
    private String TypeOfStaff;
}
