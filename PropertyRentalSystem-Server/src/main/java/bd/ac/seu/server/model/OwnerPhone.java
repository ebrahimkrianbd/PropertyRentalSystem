package bd.ac.seu.server.model;

import javax.persistence.Embedded;
import javax.persistence.ManyToOne;

public class OwnerPhone {
    @ManyToOne
    private long ownerNumber;
    @Embedded
    private Phone phone;
    private String ownerExxtention;
    bbb
}
