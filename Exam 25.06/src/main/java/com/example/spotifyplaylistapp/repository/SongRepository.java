package com.example.spotifyplaylistapp.repository;

import com.example.spotifyplaylistapp.model.entity.Song;
import com.example.spotifyplaylistapp.model.entity.enums.StyleNameEnum;
import com.example.spotifyplaylistapp.model.entity.view.SongViewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

    @Query("SELECT SUM(s.duration) FROM Song s")
    BigDecimal findTotalSongsDuration();

    List<Song> findAllByStyle_Name(StyleNameEnum styleNameEnum);
}
