package bd.ac.seu.client.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"ownerPhoneId"})
public class OwnerPhone {
    int ownerPhoneId;
    private Owner owner;
    private Phone phone;
    private String ownerExtension;
}
