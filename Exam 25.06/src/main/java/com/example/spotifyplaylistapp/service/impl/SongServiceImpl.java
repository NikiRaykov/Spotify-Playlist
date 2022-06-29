package com.example.spotifyplaylistapp.service.impl;

import com.example.spotifyplaylistapp.model.entity.Song;
import com.example.spotifyplaylistapp.model.entity.enums.StyleNameEnum;
import com.example.spotifyplaylistapp.model.entity.service.SongServiceModel;
import com.example.spotifyplaylistapp.model.entity.service.StyleServiceModel;
import com.example.spotifyplaylistapp.model.entity.view.SongViewModel;
import com.example.spotifyplaylistapp.repository.SongRepository;
import com.example.spotifyplaylistapp.repository.UserRepository;
import com.example.spotifyplaylistapp.service.SongService;
import com.example.spotifyplaylistapp.service.StyleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SongServiceImpl implements SongService {

    private final StyleService styleService;
    private final SongRepository songRepository;
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;


    public SongServiceImpl(StyleService styleService, SongRepository songRepository, ModelMapper modelMapper, UserRepository userRepository) {
        this.styleService = styleService;
        this.songRepository = songRepository;
        this.modelMapper = modelMapper;

        this.userRepository = userRepository;
    }

    @Override
    public void addSong(SongServiceModel songServiceModel) {
        StyleServiceModel styleServiceModel = this.styleService
                .findByStyleNameEnum(songServiceModel.getStyle().getName());

       songServiceModel.setStyle(styleServiceModel);

       this.songRepository.save(this.modelMapper.map(songServiceModel, Song.class));
    }

    @Override
    public BigDecimal getTotalDuration() {
        return songRepository.findTotalSongsDuration();
    }


    @Override
    public void removeAll() {
        songRepository.deleteAll();
    }

    @Override
    public List<SongViewModel> findAllSongsByStyleName(StyleNameEnum styleNameEnum) {
        return songRepository.findAllByStyle_Name(styleNameEnum)
                .stream()
                .map(song -> modelMapper.map(song, SongViewModel.class))
                .collect(Collectors.toList());
    }

}
