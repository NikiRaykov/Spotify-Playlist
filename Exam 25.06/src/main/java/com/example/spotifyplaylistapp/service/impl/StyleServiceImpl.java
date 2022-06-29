package com.example.spotifyplaylistapp.service.impl;

import com.example.spotifyplaylistapp.model.entity.Style;
import com.example.spotifyplaylistapp.model.entity.enums.StyleNameEnum;
import com.example.spotifyplaylistapp.model.entity.service.StyleServiceModel;
import com.example.spotifyplaylistapp.repository.StyleRepository;
import com.example.spotifyplaylistapp.service.StyleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class StyleServiceImpl implements StyleService {

    private final StyleRepository styleRepository;
    private final ModelMapper modelMapper;

    public StyleServiceImpl(StyleRepository styleRepository, ModelMapper modelMapper) {
        this.styleRepository = styleRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void initStyles() {
        if (styleRepository.count() == 0) {

            Arrays.stream(StyleNameEnum.values())
                    .forEach(styleNameEnum -> {
                        Style style = new Style(styleNameEnum, "Description for "
                                + styleNameEnum.name());


                        styleRepository.save(style);
                    });
        }
    }

    @Override
    public StyleServiceModel findByStyleNameEnum(StyleNameEnum styleNameEnum) {
        return styleRepository.findByName(styleNameEnum)
                .map(style -> modelMapper.map(style, StyleServiceModel.class))
                .orElse(null);
    }
}
