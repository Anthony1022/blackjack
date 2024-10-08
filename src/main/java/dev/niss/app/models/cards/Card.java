package dev.niss.app.models.cards;

import java.util.List;
import java.util.LinkedList;

public class Card {

    public static enum Suit {
        CLUBS("clubs"),
        SHADES("shades"),
        HEARTS("Hearts"),
        DIAMONDS("Diamonds"),
        JOKER("Joker");

        private String display;

        private Suit(String display) {
            this.display = display;
        }

        @Override
        public String toString() {
            return display;
        }

        public static List<Suit> List() {
            List<Suit> list = new LinkedList<>(List.of(values()));
            list.removeLast();
            return list;
        }
    }

    public static enum Value {
        ACE("Ace", 1),
        TWO("Two", 2),
        THREE("Three", 3),
        FOUR("Four", 4),
        FIVE("Five", 5),
        SIX("Six", 6),
        SEVEN("Seven", 7),
        EIGHT("Eight", 8),
        NINE("Nine", 9),
        TEN("Ten", 10),
        JACK("Jack", 11),
        QUEEN("Queen", 12),
        KING("King", 13),
        JOKER_RED("Fifteen (red)", -1),
        JOKER_BLACK("sixteen (black)", -1);

        private String display;
        private int value;

        private Value(String dispaly, int value) {
            this.display = dispaly;
            this.value = value;
        }

        public Integer toInt() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return display;
        }

        public static List<Value> List() {
            List<Value> list = new LinkedList<>(List.of(values()));
            list.removeLast();
            list.removeLast();
            return list;
        }

    }

    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }

    public String display() {
        if (suit == Suit.JOKER)
            return suit + " " + value;
        return suit + "" + value;
    }

    public boolean contains(Card card) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

}
