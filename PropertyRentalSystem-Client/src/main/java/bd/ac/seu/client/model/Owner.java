package bd.ac.seu.client.model;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"ownerNubmer"})
public class Owner {
    private long ownerNubmer;
    private User user;
    private Name name;
    private Address address;
    private long businessType;
    private List<OwnerPhone> ownerPhoneList;
    private List<OwnerEmail> ownerEmailList;
}
