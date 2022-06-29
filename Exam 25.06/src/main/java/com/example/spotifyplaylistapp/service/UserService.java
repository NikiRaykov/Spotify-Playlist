package com.example.spotifyplaylistapp.service;

import com.example.spotifyplaylistapp.model.entity.service.UserServiceModel;

public interface UserService {
    void registerUser(UserServiceModel userServiceModel);

    UserServiceModel findByUsernameAndPassword(String username, String password);

}
