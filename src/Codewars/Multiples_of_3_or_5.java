package Codewars;

public class Multiples_of_3_or_5 {

    public static void main(String[] args) {
        int dano = 20;
        System.out.println(solution(dano));
        System.out.println(Solution.solution(dano));
    }

        public static int solution(int number) {
            int value = 0;
            int sumOfNumbers = 0;
            for (int i = 2; i < number; i++) {
                int three = i % 3;
                int five = i % 5;
                if (three == 0 || five == 0) {
                    value++;
                }
            }
            int[] numbers = new int[value];
            int position = 0;
            for (int i = 2; i < number; i++){
                if (i%3== 0 || i%5== 0){
                    numbers[position] = i;
                    System.out.printf("%d = %d \n", position, i);
                    position++;
                }
            }
            for (int sum : numbers){
                sumOfNumbers +=sum;
            }
            return sumOfNumbers;
        }
}
class Solution {

    public static int solution(int number) {
        int sum=0;

        for (int i=0; i < number; i++){
            if (i%3==0 || i%5==0){sum+=i;}
        }
        return sum;
    }
} //наиболее короткий код, без массивов, 1 цикл ༼ つ ಥ_ಥ ༽つ
