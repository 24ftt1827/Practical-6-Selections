import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class SimpleLoginValidation {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        LocalDateTime ld = LocalDateTime.now();
        String correctUsername = "Ahmad Ali";
        String correctPassword = "12345";

        System.out.print("Enter username: ");
        String username = scan.nextLine();

        System.out.print("Enter password: ");
        String password = scan.nextLine();

        if (username.equals(correctUsername) && !password.equals(correctPassword)) {
            System.out.println("invalid password");
        } else if (!username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("invalid username");
        } else {
            System.out.println("Welcome Ahmad Ali. the time now is " + ld.format(DateTimeFormatter.ofPattern(" HH:mm:ss")));
        }
        scan.close();
    }
    
}
