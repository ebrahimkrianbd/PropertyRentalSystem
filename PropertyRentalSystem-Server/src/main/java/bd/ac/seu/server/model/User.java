package bd.ac.seu.server.model;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "user")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Min(100000)
    @Max(999999)
    private int id;

    @NotNull
    @UniqueElements
    private String userName;

    @NotNull
    private String password;

    @NotNull
    private String role;

    @NotNull
    private boolean enable;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_time;
//    @ManyToOne
//    private List<GrantedAuthority> authorityList;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return enable;
    }
}
