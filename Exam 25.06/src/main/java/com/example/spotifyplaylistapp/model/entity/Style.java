package com.example.spotifyplaylistapp.model.entity;

import com.example.spotifyplaylistapp.model.entity.enums.StyleNameEnum;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "styles")
public class Style extends BaseEntity {

    public Style(){}

    public Style(StyleNameEnum name, String description) {
        this.name = name;
        this.description = description;
    }

    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private StyleNameEnum name;

    @Column(columnDefinition = "TEXT")
    private String description;

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
