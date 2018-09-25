package bd.ac.seu.client.model;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"viewingId"})
public class Viewing {
    private int viewingId;
    private Property property;
    private Renter renter;
    private LocalDate viewingDate;
}
