package Codewars;

import java.util.stream.IntStream;

/*import static java.lang.Math.abs;*/

/* Решето Сундарама
 +проверь возможность динамически
 изменять размер массива и поставь проверку на
 деление нацело на числа из массива(до 100)*/

public class Is_a_number_prime {

    public static void main(String[] args) {
        int prime = 2147483647;
        if (isPrime(prime) == true) {
            System.out.printf("Is prime");
        } else {
            System.out.printf("Is not prime");
        }

    }

    public static boolean isPrime(int num) {
            if (num == 1 || num <= 0) {
                return false;
            } else {
                double sQrT = Math.sqrt(num);
                return IntStream.rangeClosed(2, (int)sQrT).noneMatch(i -> num % i == 0);
            }
        }


    /*static boolean primeNumber(int number) {
        boolean a = false;
        int length = 0;
        int sum = 0;
        int ten = 10;
        while (number > 3) {
            length = number % ten;
            ten *= 10;
            number -= length;
            while (length > 9) {
                length /= 10;
            }
            sum += length;
            //System.out.println(length);
        }
        //System.out.println(sum);
        a = sum % 3 == 0;
        return a;
    } //проверка делимости без остатка на 3, 6, 9;

    static boolean primeZero(int number) {
        boolean a = (number % 10 == 0 || number % 10 == 5);
        return a;
    } //является ли последняя цифра 0 или 5;

    static boolean primeTwo(int number) {
        boolean a = (number % 2 == 0);
        return a;
    } //является ли последняя цифра четной;

    static boolean primeSeven(int number) {
        boolean a = (number % 7 == 0);
        return a;
    } //является ли последняя цифра кратной 7;

    static boolean sqRoot(int number) {
        if ((sqrt(number)) % 1 != 0) {
            return false;
        } else {
            return true;
        }
    }*/

    void printerPrime(){
        System.out.printf("Is prime");
    }

    void printerNotPrime(){
        System.out.printf("Is not prime");
    }

}

