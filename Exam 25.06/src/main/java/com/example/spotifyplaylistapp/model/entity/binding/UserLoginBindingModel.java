package com.example.spotifyplaylistapp.model.entity.binding;

import org.hibernate.validator.constraints.Length;

public class UserLoginBindingModel {

    public UserLoginBindingModel(){}

    @Length(min = 3, max = 20, message = "Username length must be between 3 and 20 characters!")
    private String username;

    @Length(min = 3, max = 20, message = "Password length must be between 3 and 20 characters!")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
