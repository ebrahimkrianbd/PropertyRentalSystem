package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class BranchPhone {
    @NotNull
    @Id
    @GeneratedValue
    int branchPhoneId;
    @ManyToOne
    @NotNull
    private Branch branch;
    @NotNull
    @Embedded
    @UniqueElements
    private Phone phone;
    @NotNull
    private String brachExtension;
}
