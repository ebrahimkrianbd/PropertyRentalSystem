package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class BranchPhone {
    @ManyToOne
    private long brachNumber;
    @Embedded
    private Phone phone;
    private String brachExtension;
aaaaaaaa
}
