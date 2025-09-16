import java.util.Scanner;
import java.util.random.RandomGenerator;
public class RockPaperScissor {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    RandomGenerator random = RandomGenerator.getDefault();
       System.out.println("Welcome to Rock, Paper, Scissors!");
         System.out.println("Enter your choice (rock(0), paper(1), scissors(2)): ");
         int choice = scanner.nextInt();

         int computerChoice = random.nextInt(3);
        //  System.out.println(computerChoice);
         System.out.println("Computer chose: " + computerChoice);

         if ( choice == computerChoice) {
            System.out.println("It's a tie!");
            return;
         }
         if(choice==0 && computerChoice==1) {
            
                System.out.println("Computer wins! Paper covers Rock.");
                return;
            }
         if(choice==0 && computerChoice==2) {
                
                    System.out.println("You win! Rock crushes Scissors.");
                    return;
                }
                if(choice==1 && computerChoice==0) {
                
                    System.out.println("You win! Paper covers Rock.");
                    return;
                }
                if(choice==1 && computerChoice==2) {
                
                    System.out.println("Computer wins! Scissors cut Paper.");
                    return;
                }
                if(choice==2 && computerChoice==0) {
                
                    System.out.println("Computer wins! Rock crushes Scissors.");
                    return;
                }
                if(choice==2 && computerChoice==1) {
                
                    System.out.println("You win! Scissors cut Paper.");
                    return;
                }
            }
        }

            
