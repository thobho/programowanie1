package com.sdacademy.day5.deckofcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> allCards;
    public Deck() {
        this.allCards = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                allCards.add(new Card(suit, rank));
            }
        }
        Collections.shuffle(allCards);
    }

    public void handOut(List<Player> players){
        int n = players.size();


        for (int i = 0; i < allCards.size(); i++) {
            //
        }

    }
}
