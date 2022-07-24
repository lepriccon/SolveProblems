package Java_Beginer;

import java.nio.charset.StandardCharsets;

public class Test {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] b = alphabet.toCharArray();
        for (char a :
                b) {
            System.out.println(a + "-->" + (int)a);

        }
    }

}
