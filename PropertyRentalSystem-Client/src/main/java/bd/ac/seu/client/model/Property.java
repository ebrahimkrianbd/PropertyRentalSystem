package bd.ac.seu.client.model;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"propertyNumber"})
public class Property {
    private long propertyNumber;
    private Address address;
    private List<Advertisement> advertisementList;
    private List<Viewing> viewingList;
    private Owner owner;
    private Staff staff;
}
