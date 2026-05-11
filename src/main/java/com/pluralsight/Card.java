package com.pluralsight;

public class Card {
    // the suit of the card like the Hearts, Spades, Diamonds, Clubs
    private String suit;
    // the value of the card - 2, 3, 4 ... 10, J, Q, K, A
    private String value;
    // tracks whether the card is face up or face down
    private boolean isFaceUp;

    // constructor sets the suit and value and cards always start face down when created
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }

    // only return the suit if the card is face up, otherwise return # to hide it
    public String getSuit() {
        if (isFaceUp) {
            return suit;
        } else {
            return "#";
        }
    }

    // only return the value if the card is face up, otherwise return # to hide it
    public String getValue() {
        if (isFaceUp) {
            return value;
        } else {
            return "#";
        }
    }

    // returns whether the card is face up or not
    public boolean isFaceUp() {
        return isFaceUp;
    }





}
