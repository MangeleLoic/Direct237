package loicMangele.Direct237.services;

import loicMangele.Direct237.entities.User;
import loicMangele.Direct237.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;


    public User saveUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        return userRepo.save(user);
    }


    public User updateUser(User user) {
        if (user == null || user.getId() == null) {
            throw new IllegalArgumentException("User or User ID cannot be null");
        }
        if (!userRepo.existsById(user.getId())) {
            throw new IllegalArgumentException("User with ID " + user.getId() + " does not exist");
        }
        return userRepo.save(user);
    }


    public User findUserById(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("User ID cannot be null");
        }
        return userRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User with ID " + id + " not found"));
    }


    public List<User> findByFullname(String fullname) {
        if (fullname == null || fullname.trim().isEmpty()) {
            throw new IllegalArgumentException("Fullname cannot be null or empty");
        }
        return userRepo.findByFullname(fullname);
    }


    public List<User> findAllUsers() {
        return userRepo.findAll();
    }


    public void deleteUser(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("User ID cannot be null");
        }
        if (!userRepo.existsById(id)) {
            throw new IllegalArgumentException("User with ID " + id + " does not exist");
        }
        userRepo.deleteById(id);
    }
}

