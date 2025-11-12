import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        Scanner keyboard = new Scanner(System.in);

        int continueOuterLoop = 1;
        int continueInnerLoop = 1;
        int menuChoice = 1;
        do {
            int animalChoice = animalChoiceMenu(keyboard);
            keyboard.nextLine();

            switch (animalChoice) {
                case 1: //Tiger
                    do{
                    System.out.println("The animal which is chosen is : "
                            + tigerObject.getNameOfAnimal());
                    menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);
                    keyboard.nextLine();

                    switch (menuChoice) {
                        case 1:
                            System.out.println("Enter the name of the animal");
                            tigerObject.setNameOfAnimal(keyboard.nextLine());

                            System.out.println("Enter Weight: ");
                            tigerObject.setWeight(keyboard.nextInt());
                            System.out.println("Enter height: ");
                            tigerObject.setHeight(keyboard.nextInt());
                            System.out.println("Enter age: ");
                            tigerObject.setAge(keyboard.nextInt());
                            System.out.println("Enter number of stripes: ");
                            tigerObject.setNumberOfStripes(keyboard.nextInt());
                            System.out.println("Enter speed: ");
                            tigerObject.setSpeed(keyboard.nextInt());
                            System.out.println("Enter sound level(dB): ");
                            tigerObject.setSoundLevel(keyboard.nextDouble());
                            keyboard.nextLine();
                            System.out.println("Tiger Properties set.");
                            break;

                        case 2:

                            System.out.println("---Tiger Properties---");
                            System.out.println("Name: " + tigerObject.getNameOfAnimal());
                            System.out.println("Weight: " + tigerObject.getWeight() + " kg");
                            System.out.println("Height: " + tigerObject.getHeight() + " cm");
                            System.out.println("Age: " + tigerObject.getAge());
                            System.out.println("Stripes: " + tigerObject.getNumberOfStripes());
                            System.out.println("Speed: " + tigerObject.getSpeed() + " mph");
                            System.out.println("Sound Level: " + tigerObject.getSoundLevel() + " dB");
                            break;

                        case 3:
                            tigerObject.walking();
                            break;

                        case 4:
                            tigerObject.eatingCompleted();
                            break;

                        default:
                            System.out.println("Invalid choice. Please enter 1-4.");
                    }
                    System.out.println("Continue with this animal?(Enter 1 for yes/ 2 for no): ");
                    continueInnerLoop = keyboard.nextInt();
                    keyboard.nextLine();
            } while (continueInnerLoop == 1) ;
            break;

            case 2:
                do {


                }


        }

    }
}
