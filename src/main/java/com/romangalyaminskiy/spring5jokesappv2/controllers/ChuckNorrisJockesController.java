package com.romangalyaminskiy.spring5jokesappv2.controllers;

import com.romangalyaminskiy.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisJockesController {

    private JokeService jokeService;

    public ChuckNorrisJockesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
