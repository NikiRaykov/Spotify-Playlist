package com.example.spotifyplaylistapp.model.entity.binding;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

public class UserRegisterBindingModel {

    public UserRegisterBindingModel(){}

    @Length(min = 3, max = 20, message = "Username length must be between 3 and 20 characters!")
    private String username;

    @NotBlank(message = "Email cannot be empty")
    private String email;

    @Length(min = 3, max = 20, message = "Password length must be between 3 and 20 characters!")
    private String password;

    @Length(min = 3, max = 20)
    private String confirmPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
