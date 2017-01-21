package javaobjectorientedconcepts;

import java.util.Random;

/**
 *
 * @author Paul Peterson
 */
public class test {

    Shoe s = new Shoe();
    static Card card = new Card();
    static int deck, suit = 0, face = 0;
//    static String[] cardFace = new String[7];

    public static void main(String[] args) {

        Random r = new Random();

        Shoe s = new Shoe();
        Card card = new Card();

        
        Card[] hand = new Card[5];
        
        String cardSuit = "";

        s.initializeShoe();
        s.shuffleCards();
        for (int i = 0; i < hand.length; i++) {
            for (int j = 0; j < 11; j++) {
                deck = 0 + r.nextInt(6);
                suit = 0 + r.nextInt(3);
                face = 0 + r.nextInt(12);
                hand[i] = new Card(suit, face);
            }
        }
        displayHand(hand);
    }
//
//        public static void printCard(String[] card, String suit, String value) {
//
//        String topBottom = card.repeat(suit, 12);
//        String num = value;
//        String leftNumberandSuit = suit + " " + num + " " + suit;
//        String rightNumberAndSuit = num + " " + suit + " " + suit;
//        System.out.printf("%-11s%n", topBottom);
//        System.out.printf("%-14s%s%n", leftNumberandSuit, suit);
//        System.out.printf("%-5s%-5s%5s%n", suit, card[0], suit);
//        System.out.printf("%-5s%-5s%5s%n", suit, card[1], suit);
//        System.out.printf("%-5s%-5s%5s%n", suit, card[2], suit);
//        System.out.printf("%-5s%-5s%5s%n", suit, card[3], suit);
//        System.out.printf("%-5s%-5s%5s%n", suit, card[4], suit);
//        System.out.printf("%-5s%-5s%5s%n", suit, card[5], suit);
//        System.out.printf("%-5s%-5s%5s%n", suit, card[6], suit);
//        System.out.printf("%s%14s%n", suit, rightNumberAndSuit);
//        System.out.printf("%-11s%n", topBottom);
//    }

    public static void displayHand(Card[] hand) {
        String topBottom;
        String num;
        String leftNumberandSuit;
        String rightNumberAndSuit;
        String [] cardFace = new String[7];
        for (int i = 0; i < hand.length; i++){
            
        }

        for (int j = 0; j < hand.length; j++) {
            System.out.printf("%-12s%s", printTopBottom(hand[j]), "  ");
        }
        System.out.println("");
        for (int i = 0; i < hand.length; i++) {
            System.out.printf("%-1s", (printLeftValue(hand[i])
                    + (card.repeat(" ", 8) + hand[i].getCardBack())) + "  ");
        }
//        for (int i = 0; i < hand.length; i++) {
//            System.out.printf("%-1s", (hand[i].getCardBack()) + "   " 
//              + hand[i].getCardFaces()[face][0] + "   "  + (hand[i].getCardBack()) + "  ");
//        }
        System.out.println("");
        for (int i = 0; i < hand.length; i++) {
            System.out.printf("%-1s", ((hand[i].getCardBack()) + card.repeat(" ", 8)
                    + printRightValue(hand[i])) + "  ");
        }
        System.out.println("");
        for (int j = 0; j < hand.length; j++) {
            System.out.printf("%-11s%s", printTopBottom(hand[j]), "  ");
        }
        System.out.println("");
    }
    
    public static String[] getCardFace(Card card){
        String[] cardFace = new String[7];
        System.arraycopy(card.getCardFaces()[face], 0, cardFace, 0, 7);
        return cardFace;
    }

    public static String printTopBottom(Card card) {
        return card.repeat(card.getCardBack(), 13);
    }

    public static String printLeftValue(Card card) {
        return card.getCardBack() + " " + card.getValue() + card.getSuit();
    }

    public static String printRightValue(Card card) {
        return card.getValue() + card.getSuit() + " " + card.getCardBack();
    }
}
