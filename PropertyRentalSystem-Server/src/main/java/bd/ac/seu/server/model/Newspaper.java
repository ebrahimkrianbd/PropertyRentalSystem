package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@ToString
@Entity
public class Newspaper {
    @NotNull
    @Id
    private String newspaperName;
    @OneToMany
    @NotNull
    private List<Advertisement> advertisementList;
}
