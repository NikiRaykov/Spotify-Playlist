package com.example.spotifyplaylistapp.service;

import com.example.spotifyplaylistapp.model.entity.enums.StyleNameEnum;
import com.example.spotifyplaylistapp.model.entity.service.SongServiceModel;
import com.example.spotifyplaylistapp.model.entity.view.SongViewModel;

import java.math.BigDecimal;
import java.util.List;

public interface SongService {
    void addSong(SongServiceModel songServiceModel);

    BigDecimal getTotalDuration();
    void removeAll();

    List<SongViewModel> findAllSongsByStyleName(StyleNameEnum styleNameEnum);

}
