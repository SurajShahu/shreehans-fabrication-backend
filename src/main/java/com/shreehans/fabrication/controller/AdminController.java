package com.shreehans.fabrication.controller;

import com.shreehans.fabrication.entity.AdminSignup;
import com.shreehans.fabrication.form.AdminForm;
import com.shreehans.fabrication.form.AdminLoginForm;
import com.shreehans.fabrication.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = {
        "https://www.shreehansfabrication.com",
        "https://shreehansfabrication.netlify.app"
}) // Aapka frontend port
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService service;

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@Valid @RequestBody AdminForm adminSignup) {
        return ResponseEntity.ok(service.saveAdmin(adminSignup));
    }

    @PostMapping("/signin")
    public ResponseEntity<?> signIn(@RequestBody AdminLoginForm form) {

        System.out.println("👉 /admin/signin API HIT");
        System.out.println("👉 LoginId: " + form.getLoginId());
        System.out.println("👉 Password: " + form.getPassword());

        AdminSignup signup = service.login(form.getLoginId(), form.getPassword());

        if (signup == null) {
            System.out.println("❌ User NOT found in DB");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Invalid username or password");
        }

        System.out.println("✅ User FOUND: " + signup.getLoginId());
        return ResponseEntity.ok(signup);
    }

}
