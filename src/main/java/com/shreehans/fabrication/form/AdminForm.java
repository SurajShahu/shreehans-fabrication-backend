package com.shreehans.fabrication.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AdminForm {
    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 100, message = "Name must be 3 to 100 characters")
    private String name;

    @NotBlank(message = "Login ID is required")
    @Size(max = 50, message = "Login ID max 50 characters")
    private String loginId;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be minimum 6 characters")
    private String password;

    @NotBlank(message = "Staff type is required")
    private String staffType;

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
