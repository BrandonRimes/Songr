package com.brandon.songr.controllers;

import com.brandon.songr.models.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Locale;
import java.util.ArrayList;

@Controller
public class SongrController {

    @GetMapping("/hello")
            public String helloWorldPage(Model m)
    {
        m.addAttribute("capitalText", "Hey Y'all!");
        return "hello";
    }

    @GetMapping("/capitalize/{capitalText}")
    public String capitalizePage(Model m, @PathVariable String capitalText)
    {
        m.addAttribute("capitalText", capitalText.toUpperCase());

        return "hello";
    }

    @GetMapping("/")
    public String splashPage()
    {
        return "index";
    }

    @GetMapping("/albums")
    public String albumPage(Model m)
    {
        Album hokusai = new Album("Fuji from Gotenyama, at Shinagawa on the Tōkaidō", "Hokusai", 11, 33, "https://www.creativeboom.com/uploads/articles/ed/ed85b7d002d02c4715dde0119373db411c8d5a7d_810.jpg");
        Album vangogh = new Album("Wheatfield", "Van Gogh", 13, 42, "https://images.metmuseum.org/CRDImages/ep/original/DT1567.jpg");
        Album monet = new Album("Water Lillies", "Monet", 6, 30, "https://www.artic.edu/iiif/2/3c27b499-af56-f0d5-93b5-a7f2f1ad5813/full/843,/0/default.jpg");

        ArrayList<Album> albums = new ArrayList<>();
        albums.add(hokusai);
        albums.add(vangogh);
        albums.add(monet);

        m.addAttribute("albums", albums);

        return "albums";
    }
}
