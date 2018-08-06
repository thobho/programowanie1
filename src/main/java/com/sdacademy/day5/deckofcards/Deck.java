package com.sdacademy.day5.deckofcards;

import java.util.*;

import static com.sdacademy.day5.deckofcards.Suit.DIAMONDS;

public class Deck {

    private final List<Card> allCards;


    public Deck() {
        this.allCards = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                allCards.add(new Card(suit, rank));
            }
        }
        Collections.shuffle(allCards);
    }

     public void handOut(final List<Player> players) {
        int n = players.size();
        Deque<Card> cardQueue = new LinkedList<>(allCards);
        int actual = 0;
        while (!cardQueue.isEmpty()) {
            Player playerToGetCard = getPlayerToGetCard(players, actual % players.size());
            playerToGetCard.getCard(cardQueue.pollFirst());
            actual++;
        }
    }

    private Player getPlayerToGetCard(List<Player> players, int actual) {
        return players.get(actual);
    }

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Jan"));
        players.add(new Player("Staaś"));
        players.add(new Player("Marysia"));

        Suit dimonds = DIAMONDS;

        Deck deck = new Deck();

        deck.handOut(players);

        System.out.println(players);

    }
}
