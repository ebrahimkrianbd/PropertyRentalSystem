package bd.ac.seu.server.service;

import bd.ac.seu.server.model.User;
import bd.ac.seu.server.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public Optional<User> createUser(User user){
        Optional<User> localUser = userRepository.findById(user.getUsername());
        if(localUser != null ){
            System.out.printf("User with Username already exist. Nothing will done");
        }else {
            userRepository.save(user);
        }
        return localUser;
    }

    public Optional<User> getUser(String username, String password) {
        return userRepository.findById(username);
    }

    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    public void updateUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(User user){
        userRepository.delete(user);
    }

}
