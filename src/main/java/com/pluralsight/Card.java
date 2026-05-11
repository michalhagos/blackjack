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

    // calculates the point value of the card based on its value. only returns points if the card is face up
    public int getPointValue() {
        if (!isFaceUp) {
            return 0;
        }

        // face cards are worth 10 points each
        if (value.equals("J") || value.equals("Q") || value.equals("K")) {
            return 10;
        }

        // ace is worth 11 points by default , the Hand class will handle counting it as 1 if I need it
        if (value.equals("A")) {
            return 11;
        }

        // here all number cards are worth their face value
        return Integer.parseInt(value);
    }


    // flips the card over and if it was Face down it becomes face up and the other way as well
    public void flip() {
        isFaceUp = !isFaceUp;
    }






}
