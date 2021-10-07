package com.brandon.songr.repositories;

import com.brandon.songr.models.Album;
import com.brandon.songr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
    public Song findByTitle(String title);
}
