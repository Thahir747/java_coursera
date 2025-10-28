import java.util.Scanner;
public class Mainn {

    public static void main(String []args) {

        Scanner keyboard = new Scanner (System.in);

        int subChoice;

        int dayOfTheWeek=1;

         System.out.println("1.Monday");
         System.out.println("2.Tuesday");
         System.out.println("3.wed");
         System.out.println("4.thrusday");
         System.out.println("5.friday");
         System.out.println("6.sat");
         System.out.println("7.sunday");


        System.out.println("Enter you choice: ");
        dayOfTheWeek = keyboard.nextInt();

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Monday: It is back to work.....");


                System.out.println("______Breakfast_____");
                System.out.println("1. Yes, I had my breakfast");
                System.out.println("2. No, I would like one");

                System.out.println("Enter Sub choice: ");
                subChoice=keyboard.nextInt();

                switch(subChoice){
                    case 1:
                    System.out.println("Good. Now you have a catchup meeting at 9 A.M. Prepare your notes. ");
                    break;

                    case 2:
                        System.out.println("Lets us divert on Highway 54 and have a Burger on the drive in");
                        break;
                    default :
                    
                        System.out.println("NO such choice available");
                }
                break;

   
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                System.out.println("Which language: ");

                System.out.println("1.intellij");
                System.out.println("2. vs");

                System.out.println("Enter choice");

                subChoice=keyboard.nextInt();


                switch (subChoice) {
                    case 1:
                    System.out.println("IntelliJ");
                        break;
                    case 2:
                    System.out.println("vs");
                    break;
                    default:
                     System.out.println("NO such choice available");
                        
                }

                break;

            case 4:
                System.out.println("Thrussday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Enter valid choice: ");
        }
        keyboard.close();
    } 

} 