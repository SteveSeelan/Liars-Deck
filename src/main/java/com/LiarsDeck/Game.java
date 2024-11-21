package com.LiarsDeck;

import java.util.Collections;
import java.util.List;

public class Game {
    Deck deck;
    List<Player> players;
    List<Card> table;
    List<Card> previousPlayedCards;

    public Game(Deck deck, List<Player> players) {
        this.deck = deck;
        this.players = players;
        this.table = Collections.emptyList();
        this.previousPlayedCards = Collections.emptyList();
    }

    public Deck getDeck() {
        return deck;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void progressGame() {}

    public void addCardsToTable(List<Card> playedCards) {
        table.addAll(playedCards);
        previousPlayedCards.addAll(playedCards);
    }

    private void resetTable() {
        table.clear();
        previousPlayedCards.clear();
    }
}
