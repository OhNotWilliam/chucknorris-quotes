package de.htwberlin.web;

import de.htwberlin.service.GiveQuoteService;
import de.htwberlin.service.QuotesService;
import de.htwberlin.web.api.QuoteResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class QuoteRestController {

    private GiveQuoteService quoteService = new GiveQuoteService();

    @GetMapping(path = "/api/v1/quotes")
    public ResponseEntity<QuoteResponse> getQuote(){
        int randomselect = new Random().nextInt(GiveQuoteService.QUOTES.size());
        String quote = quoteService.getQuote(randomselect);
        QuoteResponse response = new QuoteResponse(quote);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/api/v1/quotes?index={id}")
    public ResponseEntity<QuoteResponse> getQuoteById(@PathVariable int id){
        try{
            String quote = quoteService.getQuote(id);
            QuoteResponse response = new QuoteResponse(quote);
            return ResponseEntity.ok(response);
        }catch (IndexOutOfBoundsException e){
            return ResponseEntity.notFound().build();
        }

    }

}
