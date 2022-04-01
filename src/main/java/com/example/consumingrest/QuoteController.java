package com.example.consumingrest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuoteController {

    QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/quote")
    public String quote(Model model) {
        String q = quoteService.getQuote();
        model.addAttribute("quote", q);
        return "quote";
    }
}
