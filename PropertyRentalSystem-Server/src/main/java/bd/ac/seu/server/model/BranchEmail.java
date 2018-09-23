package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@ToString
@Entity
public class BranchEmail {
    @NotNull
    @Id
    @Email
    private String brachEmailAddress;
    @NotNull
    @ManyToOne
    private Branch brancg;
}
