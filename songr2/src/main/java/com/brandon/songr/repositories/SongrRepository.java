package com.brandon.songr.repositories;

import com.brandon.songr.models.Album;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SongrRepository extends JpaRepository<Album, Long> {
    public Album findByName(String title);
}
