package bd.ac.seu.client.model;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"newspaperName"})
public class Newspaper {
    private String newspaperName;
    private List<Advertisement> advertisementList;
}
