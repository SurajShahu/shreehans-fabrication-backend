package com.shreehans.fabrication.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AdminLoginForm {
    @NotBlank(message = "Login ID is required")
    @Size(max = 50, message = "Login ID max 50 characters")
    private String loginId;
    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be minimum 6 characters")
    private String password;

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
}
