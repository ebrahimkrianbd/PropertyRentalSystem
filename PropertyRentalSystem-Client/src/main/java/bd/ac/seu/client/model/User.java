package bd.ac.seu.client.model;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"id"})
public class User {
    private int id;
    private String userName;
    private String password;
    private String role;
    private boolean enable;
    private Date created_time;
}
