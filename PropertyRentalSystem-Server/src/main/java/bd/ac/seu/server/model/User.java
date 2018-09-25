//package bd.ac.seu.server.model;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.validation.constraints.NotNull;
//import java.util.Collection;
//import java.util.List;
//@Entity
//public class User implements UserDetails {
//    @NotNull
//    @Id
//    private Long userName;
//    @NotNull
//    private String password;
//    @NotNull
//    private String role;
//    @NotNull
//    private boolean enable;
//    @NotNull
//    private boolean locked;
////    @ManyToOne
////    private List<GrantedAuthority> authorityList;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override
//    public String getPassword() {
//        return null;
//    }
//
//    @Override
//    public String getUsername() {
//        return null;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return false;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return false;
//    }
//}
