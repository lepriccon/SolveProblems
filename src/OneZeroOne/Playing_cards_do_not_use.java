/*
package OneZeroOne;

public class Playing_cards_do_not_use {

        short size;
        static short[] suits = new short[4];

        static short[] randomSuits = new short[36];
        static String[] suitsTxT = {"Heart", "Spike", "Diamonds", "Clouds"};
        */
/*static short[] values = {"6", "7", "8", "9", "10", "11", "12", "13", "14"}; // 11-Jack, 12-Queen, 13-King, 14-Ace;*//*

        */
/*static String[] valuesTxT = {"six", "seven", "eight", "nine", "ten", "Jack", "Queen", "King", "Ace"};*//*

        static String[] valuesTxT = {"6", "7", "8", "9", "10", "11", "12", "13", "14"};

        static short[] randomValues = new short[36];

        static short[] values = new short[9];



        public static void main(String[] args) {
                Card[] cards = new Card[36];
                cards[0] = new Card("Heart", 8);
                RandomSuits();
                RandomValues();
                for (int i = 0; i< randomSuits.length; i++){
                        System.out.println("Cards[" + i + "] = new Card(\"" + suitsTxT[randomSuits[i]-1] + "\", " + valuesTxT[randomValues[i]-1] + ");");
                }

               */
/* for (int i = 0; i< randomValues.length; i++){
                        System.out.println("#" + i + "--->" + valuesTxT[randomValues[i]-1]);
                }*//*


        }

        static boolean isUnique(short random, short[] numbers) {
                short i = 0;
                short counter = 0;
                boolean o = true;
                while (i < numbers.length) {
                        if (numbers[i] == random){
                                o = false;}
                        i++;
                } return o;
        }

        static short[] RandomSuits(){
                short i = 0;
                short count = 0;
                while (count < 36){
                        i = 0;
                        while (i < 4) {
                                short number = (short) (Math.random() * 5);
                                if (isUnique(number, suits) == true) {
                                        suits[i] = number;
                                        randomSuits[count] = suits[i];
                                        i++;
                                        count++;
                                }
                        }
                 suits = new short[4];
                }
                return randomSuits;
        }

        static short[] RandomValues(){
                short i = 0;
                short count = 0;
                while (count < 36){
                        i = 0;
                        while (i < 9) {
                                short number = (short)(Math.random()*10);
                                if (isUnique(number, values) == true){
                                        values[i] = number;
                                        randomValues[count] = values[i];
                                        i++;
                                        count++;
                                }
                        }
                        values = new short[9];
                }
                return randomValues;
        }


       */
/* public Card CardCreator(){
                String[] suits = {"Heart", "Spike", "Diamonds", "Clouds"};
                Short[] values = {6, 7, 8, 9, 10, 11, 12, 13, 14}; // 11-Jack, 12-Queen, 13-King, 14-Ace;


                return Card;
        }
*//*

        static class Card{
               public Card(String suit, int value) {
               }
       }
}




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


                */
