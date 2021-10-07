package com.brandon.songr.controllers;

import com.brandon.songr.models.Song;
import com.brandon.songr.models.Album;
import com.brandon.songr.repositories.SongRepository;
import com.brandon.songr.repositories.SongrRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {
    @Autowired
    SongrRepository songrRepository;
    @Autowired
    SongRepository songRepository;

    @GetMapping("/songs")
    public String songsPage(Model m)
    {
        Song song1 = new Song("This Is A Song",222, 1, theAlbum);

        return "songs";
    }

    @PostMapping("/songs")
    RedirectView addSongToAlbum(String title, int length, int trackNumber, String albumTitle)
    {
        Album album = songrRepository.findByTitle(albumTitle);
        Song newSong = new Song(title, length, trackNumber, album);
        songRepository.save(newSong);

        return new RedirectView("/songs");
    }
}
