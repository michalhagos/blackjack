package com.pluralsight;

import java.util.ArrayList;

public class Deck {

    // the list of cards in the deck
    private ArrayList<Card> cards;

    // constructor builds a full deck of 52 cards
// loops through all suits and values to create every card
    public Deck() {
        cards = new ArrayList<>();

        // all four suits in a standard deck
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};

        // all thirteen values in a standard deck
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        // nested loop creates one card for every suit and value combination
        for (String suit : suits) {
            for (String value : values) {
                cards.add(new Card(suit, value));
            }
        }
    }


}
