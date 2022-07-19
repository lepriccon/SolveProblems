package OneZeroOne;

import java.util.Random;

public class Playing_cards {

        public static void main(String[] args) {
                Card[] cards = new Card[36];
                cards[3] = new Card("Spike", 12);
                cards[5] = new Card("Spike", 6);
                cards[12] = new Card("Spike", 13);
                cards[16] = new Card("Spike", 9);
                cards[27] = new Card("Spike", 10);
                cards[31] = new Card("Spike", 11);
                cards[34] = new Card("Spike", 7);
                cards[23] = new Card("Spike", 8);
                cards[8] = new Card("Spike", 14);

                cards[10] = new Card("Diamonds", 11);
                cards[17] = new Card("Diamonds", 8);
                cards[14] = new Card("Diamonds", 12);
                cards[20] = new Card("Diamonds", 9);
                cards[33] = new Card("Diamonds", 14);
                cards[29] = new Card("Diamonds", 6);
                cards[25] = new Card("Diamonds", 7);
                cards[2] = new Card("Diamonds", 13);
                cards[4] = new Card("Diamonds", 10);

                cards[15] = new Card("Heart", 6);
                cards[35] = new Card("Heart", 8);
                cards[19] = new Card("Heart", 12);
                cards[11] = new Card("Heart", 14);
                cards[6] = new Card("Heart", 7);
                cards[21] = new Card("Heart", 13);
                cards[24] = new Card("Heart", 10);
                cards[28] = new Card("Heart", 11);
                cards[1] = new Card("Heart", 9);

                cards[26] = new Card("Clouds", 7);
                cards[22] = new Card("Clouds", 9);
                cards[18] = new Card("Clouds", 10);
                cards[13] = new Card("Clouds", 8);
                cards[30] = new Card("Clouds", 13);
                cards[32] = new Card("Clouds", 14);
                cards[9] = new Card("Clouds", 11);
                cards[7] = new Card("Clouds", 6);
                cards[0] = new Card("Clouds", 12);

                if (System.currentTimeMillis()%2 == 0){
                        shuffleA(cards);
                }else
                        shuffleB(cards);
                print(cards);

        }

        static class Card{
                static String[] valuesTxT = {"six", "seven", "eight", "nine", "ten", "Jack", "Queen", "King", "Ace"};
                String suitC;
                int valueC;
                public Card(String suit, int value) {
                        suitC = suit;
                        valueC = value;
                }
                @Override
                public String toString() {
                        String suit;
                        String value;
                        suit = String.format("<<%-8s", suitC);
                        value = String.format("%6s>>", valuesTxT[valueC-6]);
                        return suit + value;
                }
       }
       
       public static void print(Card[] cards){
               for (int i = 0; i<35; i++){
                       System.out.println(cards[i].toString());
               }
        }

       public static void shuffleA (Card[] cards){
               Random random = new Random();
               int rnd = random.nextInt(25, 35);
                for (int i = 0; i < rnd; i++ ){
                        int left = random.nextInt(0, 35);
                        int right = random.nextInt(0, 35);
                        Card leftCard = cards[left];
                        Card rightCard = cards[right];
                        cards[left] = rightCard;
                        cards[right] = leftCard;
                }
       }

        public static void shuffleB (Card[] cards){
                Random random = new Random();
                for (int i = 0; i < cards.length; i++ ){
                        int next = random.nextInt(0, 35);
                        Card nextCard = cards[i];
                        Card prevCard = cards[next];
                        cards[i] = prevCard;
                        cards[next] = nextCard;
                }
        }

       /* public static void shuffleC (Card[] cards){
                Random random = new Random();
                Card[] newCards = new Card[36];
                int next = 0;
                for (int i = 0; i < cards.length; i++ ){
                        while(newCards[next] == null){
                        next = random.nextInt(0, 35);
                        if (newCards[next] == null){
                                newCards[next] = cards[i];
                        }
                        }
                }

        }*/
}
