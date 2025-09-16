import java.util.Scanner;
import java.util.random.RandomGenerator;
public class AddFourNumber{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
       RandomGenerator random = RandomGenerator.getDefault();
       int number1 = random.nextInt(100);
       int number2 = random.nextInt(100);
       int number3 = random.nextInt(100);
       int number4 = random.nextInt(100);
       int sum = number1 + number2 + number3 + number4;
       System.out.println("what is the sum of " + number1 + " + " + number2 + " + " + number3 + " + " + number4 + "?");
       int userAnswer = scan.nextInt();
       if (userAnswer == sum) {
           System.out.println("Correct!");
       } else {
           System.out.println("Incorrect. The correct answer is: " + sum);
       }
       scan.close();
   }
}