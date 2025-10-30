import java.util.Scanner;

public class car {
    public static void main(String[] args) {

        boolean engineState =false;
        String gear="P";
        int currentSpeed=0;
        int userChoice=0;
        Scanner keyboard=new Scanner(System.in);



        while(userChoice!=5){
            System.out.println(".........Car dashboard.............");
            System.out.println("Current Engine State: " + engineState);
            System.out.println("Cureent gear: "+ gear);
            System.out.println("Current speed: "+ currentSpeed);


            System.out.println("1. Turn on/off the engine");
            System.out.println("2. Change gear (P, D, R)");
            System.out.println("3. Accelerate");
            System.out.println("4. Brake");
            System.out.println("5. Exit");
       
            System.out.println("Enter your choice: ");

            userChoice=keyboard.nextInt();


            switch (userChoice) {
                case 1:
                    engineState=!engineState;
                    break;
                case 2:
                    System.out.println("Enter gear(P,D,R)");
                    gear=keyboard.next();
                    break;

                case 3:
                    if(engineState && !gear.equals("P")){
                        currentSpeed +=10;
                    }else{
                    System.out.println("Cannot accelerate while engine is off or in Park (P) gear.");
                    }
                    break;

                case 4:
                    if(engineState && currentSpeed>0){
                        currentSpeed -=5;
                    }else{
                        System.out.println("Cannot apply braking while engine is off or car not moving.");
                    }
                    break;

                case 5:
                    System.out.println("Turning off engine and exiting the car. Goodbye!");
                    break;

                default:
                    System.out.println("Enter valid number");
                    break;
        }
    }
    keyboard.close();
}
}
