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



    // calculates the total point value of all cards in the hand
// ace counts as 11 by default
// if the total is over 21 and there is an ace, it counts as 1 instead
    public int getValue() {
        int total = 0;
        int aceCount = 0;

        // add up all card values and track how many aces we have
        for (Card card : cards) {
            total += card.getPointValue();
            if (card.getValue().equals("A")) {
                aceCount++;
            }
        }

        // if we are over 21 and have aces, count each ace as 1 instead of 11
        // subtracting 10 changes an ace from 11 to 1
        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }

        return total;
    }

    // displays all cards in the player's hand and their total value
    public void displayHand() {
        System.out.println(playerName + "'s hand:");
        for (Card card : cards) {
            System.out.println("  " + card.getValue() + " of " + card.getSuit());
        }
        System.out.println("  Total: " + getValue());
    }



}
