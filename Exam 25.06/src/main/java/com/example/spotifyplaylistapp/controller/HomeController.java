package com.example.spotifyplaylistapp.controller;

import com.example.spotifyplaylistapp.model.entity.enums.StyleNameEnum;
import com.example.spotifyplaylistapp.service.SongService;
import com.example.spotifyplaylistapp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    private final SongService songService;

    public HomeController(SongService songService) {
        this.songService = songService;

    }

    @GetMapping("/")
    public String index(HttpSession httpSession, Model model) {

        if (httpSession.getAttribute("user") == null) {
            return "index";
        }

        model.addAttribute("totalSongDuration", songService.getTotalDuration());
        model.addAttribute("pop", songService.findAllSongsByStyleName(StyleNameEnum.POP));
        model.addAttribute("rock", songService.findAllSongsByStyleName(StyleNameEnum.ROCK));
        model.addAttribute("jazz", songService.findAllSongsByStyleName(StyleNameEnum.JAZZ));

        return "home";
    }
}
