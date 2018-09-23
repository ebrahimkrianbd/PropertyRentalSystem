package bd.ac.seu.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Embeddable
public class Phone {
    private String areaCode;
    private String phoneNumber;
}
