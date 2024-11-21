package com.LiarsDeck;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private final List<Card> deck;

    public Deck() {
        this.deck = createDeck();
    }

    private ArrayList<Card> createDeck() {
        ArrayList<Card> cards = new ArrayList<>();
        for (CardType type : CardType.values()) {
            if (type == CardType.JOKER) {
                cards.add(new Card(CardType.JOKER, 2));
            } else {
                cards.add(new Card(type, 6));
            }
        }

        return cards;
    }

    public List<Card> getDeck() {
        return deck;
    }
}
