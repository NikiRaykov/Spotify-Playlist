package com.example.spotifyplaylistapp.model.entity.binding;

import com.example.spotifyplaylistapp.model.entity.enums.StyleNameEnum;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class SongBindingModel {

    public SongBindingModel(){}

    @Length(min = 3, max = 20, message = "Performer name length must be between 3 and 20 characters!")
    private String performer;

    @Length(min = 2, max = 20, message = "The length must be between 2 and 20 characters!")
    private String title;

    @DecimalMin(value = "0", message = "Duration must be positive")
    private BigDecimal duration;

    @PastOrPresent(message = "The date cannot be in the future")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate releaseDate;

    @NotNull(message = "You must select a style")
    private StyleNameEnum style;

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

    public StyleNameEnum getStyle() {
        return style;
    }

    public void setStyle(StyleNameEnum style) {
        this.style = style;
    }
}
