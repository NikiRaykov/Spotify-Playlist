package com.example.spotifyplaylistapp.model.entity.service;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SongServiceModel {

    public SongServiceModel(){}

    private Long id;
    private String performer;
    private String title;
    private BigDecimal duration;
    private LocalDate releaseDate;
    private StyleServiceModel style;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public StyleServiceModel getStyle() {
        return style;
    }

    public void setStyle(StyleServiceModel style) {
        this.style = style;
    }
}
