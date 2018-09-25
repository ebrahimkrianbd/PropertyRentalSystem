package bd.ac.seu.server.service;


import bd.ac.seu.server.model.User;
import bd.ac.seu.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class UserSecurityService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> optionalUser = userRepository.findById(s);
        optionalUser.orElseThrow(()-> new UsernameNotFoundException("username in not found"));

        return optionalUser.map(User:: new).get();
    }
}
