package com.romangalyaminskiy.spring5jokesappv2.services.impl;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;
import com.romangalyaminskiy.spring5jokesappv2.services.JokeService;

@Service
public class JokeServiceImpl implements JokeService {

    private ChuckNorrisQuotes jokesProvider;

    public JokeServiceImpl(ChuckNorrisQuotes jokesProvider) {
        this.jokesProvider = jokesProvider;
    }

    @Override
    public String getJoke() {
        return jokesProvider.getRandomQuote();
    }
}
