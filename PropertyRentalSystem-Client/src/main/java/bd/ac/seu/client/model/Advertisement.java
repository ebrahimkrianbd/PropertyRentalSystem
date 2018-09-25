package bd.ac.seu.client.model;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"advertisementNumber"})
public class Advertisement {
    private long  advertisementNumber;
    private Newspaper newspaperName;
    private Property property;
    private LocalDate advertisementDate;
}
