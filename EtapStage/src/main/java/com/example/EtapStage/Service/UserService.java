package com.example.EtapStage.Service;

import com.example.EtapStage.Entity.User;
import com.example.EtapStage.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements InterfaceUtilisateur<User>{
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    UserRepository ur;
    @Override
    public List<User> getall() {
        List<User> lu=ur.findAll();
        return lu;
    }

    @Override
    public void add(User user) {
        ur.save(user);
    }

    @Override
    public void delete(Long id) {
        ur.deleteById(id);
    }

    @Override
    public void update(User user) {
        ur.save(user);
    }

    public String encodePassword(String rawPassword) {
        return passwordEncoder.encode(rawPassword);
    }
}
