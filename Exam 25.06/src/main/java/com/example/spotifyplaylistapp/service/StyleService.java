package com.example.spotifyplaylistapp.service;


import com.example.spotifyplaylistapp.model.entity.enums.StyleNameEnum;
import com.example.spotifyplaylistapp.model.entity.service.StyleServiceModel;

public interface StyleService {
    void initStyles();

    StyleServiceModel findByStyleNameEnum(StyleNameEnum styleNameEnum);
}
