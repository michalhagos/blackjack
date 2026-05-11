package com.pluralsight;

import java.util.ArrayList;

public class Hand {

    // the player's name
    private String playerName;

    // the list of cards in the player's hand
    private ArrayList<Card> cards;


    // constructor sets the player name and initializes the empty cards list
    public Hand(String playerName) {
        this.playerName = playerName;
        this.cards = new ArrayList<>();
    }

    // returns the name of the player who owns this hand
    public String getPlayerName() {
        return playerName;
    }


    // adds a card to the player's hand
// the card is flipped face up so the player can see it
    public void deal(Card card) {
        card.flip();
        cards.add(card);
    }



}
