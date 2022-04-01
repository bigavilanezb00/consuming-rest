package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {
    private RestTemplate restTemplate;

    @Autowired
    public QuoteService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getQuote() {
        Quote quote = restTemplate.getForObject(
                "https://api.chucknorris.io/jokes/random", Quote.class);
        return quote.getValue();
    }
}
