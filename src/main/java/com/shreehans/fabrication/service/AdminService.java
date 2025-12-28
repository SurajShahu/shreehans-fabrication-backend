package com.shreehans.fabrication.service;

import com.shreehans.fabrication.entity.AdminSignup;
import com.shreehans.fabrication.form.AdminForm;
import com.shreehans.fabrication.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepository repo;

    public AdminSignup saveAdmin(AdminForm adminSignup) {
        AdminSignup adminSignup1 = new AdminSignup();
        adminSignup1.setName(adminSignup.getName());
        adminSignup1.setLoginId(adminSignup.getLoginId());
        adminSignup1.setPassword(adminSignup.getPassword());
        adminSignup1.setStaffType(adminSignup.getStaffType());
        return repo.save(adminSignup1);
    }

    public AdminSignup login(String loginId, String password) {

        System.out.println("🔍 Service login() called");
        System.out.println("🔍 loginId = " + loginId);

        Optional<AdminSignup> optionalAdmin =
                repo.findByLoginIdAndPassword(loginId, password);

        if (optionalAdmin.isEmpty()) {
            System.out.println("❌ No admin found in DB");
            return null;
        }

        System.out.println("✅ Admin found");
        return optionalAdmin.get();
    }

}
