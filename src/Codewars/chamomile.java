package Codewars;

public class chamomile {

    public static void main(String[] args) {
        int howMuch = 5;
        System.out.println(howMuchILoveYou(howMuch));
        System.out.println(SidTest.howMuchILoveYou(howMuch));
    }
    public static String howMuchILoveYou(int nb_petals) {
        if (nb_petals !=0 ) {
            int petals = nb_petals;
            if (nb_petals > 6){
                petals = nb_petals % 6;
            }
            switch (petals) {
                case 1:
                    return "I love you";
                case 2:
                    return "a little";
                case 3:
                    return "a lot";
                case 4:
                    return "passionately";
                case 5:
                    return "madly";
                case 6:
                case 0:
                    return "not at all";
            }
        }
        return "you type 0";

    }


}
class SidTest {
    public static String howMuchILoveYou(int nb_petals) {

        String[] arr ={"not at all", "I love you",  "a little", "a lot", "passionately", "madly"};

        return arr[nb_petals%6];
    }

}
