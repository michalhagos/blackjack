package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

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

    // add a method shuffles the deck into a random order
// uses Java's builtin Collections.shuffle method
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // deals the top card from the deck
// then removes it from the deck and returns it . returns null if there are no cards left

    public Card deal() {
        if (cards.size() > 0) {
            return cards.remove(0);
        } else {
            return null;
        }
    }

    // returns how many cards are left in the deck
    public int getSize() {
        return cards.size();
    }





}
