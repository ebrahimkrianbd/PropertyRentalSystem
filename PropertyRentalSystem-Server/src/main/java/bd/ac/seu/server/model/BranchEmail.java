package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class BranchEmail {
    @Id
    private String brachEmailAddress;
    @ManyToOne
    private Branch brancg;
}
