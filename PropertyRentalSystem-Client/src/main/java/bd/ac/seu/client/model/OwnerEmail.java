package bd.ac.seu.client.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"ownerEmailAddress"})
public class OwnerEmail {
    private String ownerEmailAddress;
    private Owner owner;
}
