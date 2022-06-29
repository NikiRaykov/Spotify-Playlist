package com.example.spotifyplaylistapp.model.entity.service;

import com.example.spotifyplaylistapp.model.entity.enums.StyleNameEnum;

public class StyleServiceModel {

    public StyleServiceModel(){}

    private Long id;
    private StyleNameEnum name;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StyleNameEnum getName() {
        return name;
    }

    public void setName(StyleNameEnum name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
