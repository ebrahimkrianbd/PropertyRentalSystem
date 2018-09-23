package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class BranchPhone {
    @Id
    @GeneratedValue
    int branchPhoneId;
    @ManyToOne
    private Branch branch;
    @Embedded
    private Phone phone;
    private String brachExtension;
}
