package com.LiarsDeck;

public class Card { // would be abstract if each card type had a different function but similar
    private final CardType cardType;
    private int cardQuantity;

    public Card(CardType cardType, int cardQuantity) {
        this.cardType = cardType;
        this.cardQuantity = cardQuantity;
    }

    public int decrease(CardType cardType, int quantity) {
        cardQuantity = cardQuantity - quantity;
        return Math.max(cardQuantity, 0);
    }
}
