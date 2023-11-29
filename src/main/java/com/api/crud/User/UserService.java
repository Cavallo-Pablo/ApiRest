package com.api.crud.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Service
@RequiredArgsConstructor
@Getter
@Setter
public class UserService {

    @Autowired
    UserRepository userRepo;

    public void createUser(User user) {
        userRepo.save(user);
    }

    public void deleteUser(Integer id) {
        userRepo.deleteById(id);
    }

    public List<User> listUsers() {
        return userRepo.findAll();
    }

    public User searchUser(Integer id) {
        return userRepo.findById(id).orElse(null);
    }

    public void editUser(User user) {
        userRepo.save(user);
    }

    public User loginUser(String userName, String password) {
        return userRepo.findByUserNameAndPassword(userName, password);
    }

}
