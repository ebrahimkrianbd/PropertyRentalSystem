package bd.ac.seu.server.service;

import bd.ac.seu.server.model.User;
import bd.ac.seu.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserSecurityService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findById(s).get();

        if(user == null){
            throw new UsernameNotFoundException("Username " + s + "not found");
        }
        return  user;
    }
}
