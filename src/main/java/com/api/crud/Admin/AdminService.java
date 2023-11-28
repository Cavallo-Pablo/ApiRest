package com.api.crud.Admin;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminRepository adminRepo;
    public void createAdmin(Admin admin){
        adminRepo.save(admin);
    }
}
