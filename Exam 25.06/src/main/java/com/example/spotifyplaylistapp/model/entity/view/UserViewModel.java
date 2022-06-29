package com.example.spotifyplaylistapp.model.entity.view;

import com.example.spotifyplaylistapp.model.entity.Song;

import java.util.HashSet;
import java.util.Set;

public class UserViewModel {

    public UserViewModel(){}

    private Set<Song> playlist = new HashSet<>();

    public Set<Song> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Set<Song> playlist) {
        this.playlist = playlist;
    }
}
