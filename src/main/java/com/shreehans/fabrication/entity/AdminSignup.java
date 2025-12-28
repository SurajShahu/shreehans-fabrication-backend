package com.shreehans.fabrication.entity;

import org.springframework.context.annotation.Configuration;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class AdminSignup {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(nullable = false,length = 100)
    private String name;
    @Column(nullable = false,unique = true, length = 50)
    private String loginId;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String staffType;
    // ---------- getters & setters ----------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    // later password encrypt kar sakte ho
    public void setPassword(String password) {
        this.password = password;
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }
}
