package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner theScanner = new Scanner(System.in);

        // ask the user how many players will be playing
        System.out.print("How many players are playing? ");
        int numberOfPlayers = Integer.parseInt(theScanner.nextLine());

// create a hand for each player using their name
        ArrayList<Hand> hands = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.print("Enter name for player " + (i + 1) + ": ");
            String name = theScanner.nextLine();
            hands.add(new Hand(name));
        }

// create a new deck and shuffle it before dealing
        Deck deck = new Deck();
        deck.shuffle();
        System.out.println("\nDeck shuffled. Dealing cards...\n");

// this deal 2 cards to each player one at a time
// also deals one round at a time like a real card game
        for (int i = 0; i < 2; i++) {
            for (Hand hand : hands) {
                hand.deal(deck.deal());
            }
        }






    }








}
