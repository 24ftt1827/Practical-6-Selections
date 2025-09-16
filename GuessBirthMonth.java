import java.util.Scanner;
public class GuessBirthMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       System.out.println("Is your birth month in Set 1?\n" +  "1 3 5 7 9 11\n" + "Enter 1 for yes, Enter 0 for no"  );
       int answer1 = scan.nextInt();
         System.out.println("Is your birth month in Set 2?\n" +  "2 3 6 7 10 11\n" + "Enter 1 for yes, Enter 0 for no"  );
       int answer2 = scan.nextInt();
         System.out.println("Is your birth month in Set 3?\n" +  "4 5 6 7 12\n" + "Enter 1 for yes, Enter 0 for no"  );
       int answer3 = scan.nextInt();
            System.out.println("Is your birth month in Set 4?\n" +  "8 9 10 11 12\n" + "Enter 1 for yes, Enter 0 for no"  );
       int answer4 = scan.nextInt();

       int birthmonth = 0;
       if (answer1 ==1) {
        birthmonth += 1;
       }
        if (answer2 ==1) {
            birthmonth +=2;
        }
            if (answer3 ==1) {
                birthmonth +=4;
            }
                if (answer4 ==1) {
                    birthmonth +=8;
                }      
       System.out.println(birthmonth);
       if(birthmonth == 0){
        System.out.println("You must have entered all 0s. Please try again.");
       } 
              if(birthmonth == 1){
                System.out.println("Your birth month is January");
            }
                   if(birthmonth == 2){
                    System.out.println("Your birth month is February");

    }
           if(birthmonth == 3){
               System.out.println("Your birth month is March");
           }
                  if(birthmonth == 4){
                    System.out.println("Your birth month is April");
                }
                       if(birthmonth == 5){
                        System.out.println("Your birth month is May");
                       }
                              if(birthmonth == 6){
                                System.out.println("Your birth month is June");
                              }
                                     if(birthmonth == 7){
                                        System.out.println("Your birth month is July");
                                     }
                                            if(birthmonth == 8){
                                                System.out.println("Your birth month is August");
                                            }
                                                   if(birthmonth == 9){
                                                    System.out.println("Your birth month is September");
                                                   }
                                                          if(birthmonth == 10){
                                                            System.out.println("Your birth month is October");
                                                          }
                                                                 if(birthmonth == 11){
                                                                    System.out.println("Your birth month is November");
                                                                 }
                                                                        if(birthmonth == 12){
                                                                            System.out.println("Your birth month is December");
                                                                        }
       scan.close();


    }
}
