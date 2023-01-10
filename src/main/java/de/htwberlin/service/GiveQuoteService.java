package de.htwberlin.service;

import java.util.List;

public class GiveQuoteService implements QuotesService{

    List<String> quotes = QUOTES;

    public String getQuote(int index) throws IllegalArgumentException{
        return quotes.get(index);
    }

}
