package dev.niss.app.models.cards;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {
    private LinkedList<Card> cards;
    private Boolean includeJokers;

    public Deck() {
        this(false);
    }

    public Deck(boolean includeJokers) {
        cards = new LinkedList<>();
        this.includeJokers = includeJokers;
        initialize();
    }
    public void addCard(Card card){
        if(!card.contains(card))
        cards.addFirst(card);
    }
    
    public void initialize() {
        Card.Suit.List().forEach(suit -> {
            Card.Value.List().forEach(value -> {
                cards.add(new Card(suit, value));
            });
        });

        if (includeJokers) {
            cards.add(new Card(Card.Suit.JOKER, Card.Value.JOKER_RED));
            cards.add(new Card(Card.Suit.JOKER, Card.Value.JOKER_BLACK));
        }
    }

    public void shuffle() {
        initialize();
        Collections.shuffle(cards);
    }
    public void returnCards(List<Card> cards) {
        cards.addAll(cards);
    }

    public Card deal() {
        return cards.isEmpty() ? null : cards.removeLast();
    }
    public Integer cardsLeft(){
        return cards.size();
    }

    public LinkedList<Card> getCards() {
        return cards;
    }
}
