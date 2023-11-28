package com.api.crud.User;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepo;

    public void createUser(User user) {
        userRepo.save(user);
    }
}
