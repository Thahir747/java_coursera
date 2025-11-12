import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();
        Penguin penguinObject = new Penguin();

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;

        // (TODO comments removed for clarity)

        // The initial menu print was redundant and has been removed.
        // The animalChoiceMenu() method handles printing the menu.

        do { // Start of the main "do-while" loop

            int animalChoice = animalChoiceMenu(keyboard);
            keyboard.nextLine(); // Consume newline

            switch (animalChoice) {
                case 1: // Tiger
                    do {
                        System.out.println("The animal which is chosen is : " + tigerObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);
                        keyboard.nextLine();

                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter the name of the animal");
                                // --- THIS LINE WAS FIXED ---
                                tigerObject.setNameOfAnimal(keyboard.nextLine());

                                System.out.println("Enter weight:");
                                tigerObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter height:");
                                tigerObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter age:");
                                tigerObject.setAge(keyboard.nextInt());
                                System.out.println("Enter number of stripes:");
                                tigerObject.setNumberOfStripes(keyboard.nextInt());
                                System.out.println("Enter speed:");
                                tigerObject.setSpeed(keyboard.nextInt());
                                System.out.println("Enter sound level (dB):");
                                tigerObject.setSoundLevel(keyboard.nextDouble());
                                keyboard.nextLine(); // Consume newline
                                System.out.println("Tiger properties set.");
                                break;
                            case 2:
                                System.out.println("--- Tiger Properties ---");
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
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                        keyboard.nextLine(); // Consume newline
                    } while (continueInnerLoop == 1);
                    break; // End of Case 1

                case 2: // Dolphin
                    do {
                        System.out.println("The animal which is chosen is : " + dolphinObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);
                        keyboard.nextLine();

                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter name:");
                                dolphinObject.setNameOfAnimal(keyboard.nextLine());
                                System.out.println("Enter weight (kg):");
                                dolphinObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter height (cm):");
                                dolphinObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter age:");
                                dolphinObject.setAge(keyboard.nextInt());
                                keyboard.nextLine(); // Consume newline after nextInt()
                                System.out.println("Enter color:");
                                dolphinObject.setColor(keyboard.nextLine());
                                System.out.println("Enter swimming speed (knots):");
                                dolphinObject.setSwimmingSpeed(keyboard.nextInt());
                                keyboard.nextLine(); // Consume newline after nextInt()
                                System.out.println("Dolphin properties set.");
                                break;
                            case 2:
                                System.out.println("--- Dolphin Properties ---");
                                System.out.println("Name: " + dolphinObject.getNameOfAnimal());
                                System.out.println("Weight: " + dolphinObject.getWeight() + " kg");
                                System.out.println("Height: " + dolphinObject.getHeight() + " cm");
                                System.out.println("Age: " + dolphinObject.getAge());
                                System.out.println("Color: " + dolphinObject.getColor());
                                System.out.println("Swimming Speed: " + dolphinObject.getSwimmingSpeed() + " knots");
                                break;
                            case 3:
                                dolphinObject.swimming();
                                break;
                            case 4:
                                dolphinObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter 1-4.");
                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                        keyboard.nextLine(); // Consume newline
                    } while (continueInnerLoop == 1);
                    break; // End of Case 2

                // --- THIS ENTIRE CASE WAS MOVED TO BE INSIDE THE SWITCH ---
                case 3: // Penguin
                    do {
                        System.out.println("The animal which is chosen is : " + penguinObject.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);
                        keyboard.nextLine(); // Consume the newline character

                        switch (menuChoice) {
                            case 1: // Set properties
                                System.out.println("Enter name:");
                                penguinObject.setNameOfAnimal(keyboard.nextLine());
                                System.out.println("Enter weight (kg):");
                                penguinObject.setWeight(keyboard.nextInt());
                                System.out.println("Enter height (cm):");
                                penguinObject.setHeight(keyboard.nextInt());
                                System.out.println("Enter age:");
                                penguinObject.setAge(keyboard.nextInt());
                                System.out.println("Enter walking speed (mph):");
                                penguinObject.setWalkSpeed(keyboard.nextInt());
                                System.out.println("Enter swimming speed (knots):");
                                penguinObject.setSwimSpeed(keyboard.nextInt());
                                keyboard.nextLine(); // Consume newline
                                System.out.println("Penguin properties set.");
                                break;
                            case 2: // Display properties
                                System.out.println("--- Penguin Properties ---");
                                System.out.println("Name: " + penguinObject.getNameOfAnimal());
                                System.out.println("Weight: " + penguinObject.getWeight() + " kg");
                                System.out.println("Height: " + penguinObject.getHeight() + " cm");
                                System.out.println("Age: " + penguinObject.getAge());
                                System.out.println("Walking Speed: " + penguinObject.getWalkSpeed() + " mph");
                                System.out.println("Swimming Speed: " + penguinObject.getSwimSpeed() + " knots");
                                System.out.println("Current State: " + (penguinObject.isSwimming() ? "Swimming" : "Walking"));
                                break;
                            case 3: // Display movement (Special Logic)
                                System.out.println("Is the penguin...?");
                                System.out.println("1. Walking");
                                System.out.println("2. Swimming");
                                System.out.println("Enter choice (1-2):");
                                int moveChoice = keyboard.nextInt();
                                keyboard.nextLine(); // Consume newline

                                if (moveChoice == 1) {
                                    penguinObject.setSwimming(false); // Set state
                                    penguinObject.walking();
                                    System.out.println("Walking");
                                } else if (moveChoice == 2) {
                                    penguinObject.setSwimming(true); // Set state
                                    penguinObject.swimming();
                                    System.out.println("Swimming");
                                } else {
                                    System.out.println("Invalid choice.");
                                }
                                break;
                            case 4: // Display eating
                                penguinObject.eatingCompleted(); // Uses the overridden method
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter 1-4.");
                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                        keyboard.nextLine(); // Consume newline
                    } while (continueInnerLoop == 1);
                    break; // End of Case 3

                default:
                    System.out.println("Sorry, no such animal available. Please choose 1-3.");

            } // --- END OF THE switch(animalChoice) STATEMENT ---

            // --- "Continue main menu" prompt moved to its correct location ---
            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();
            keyboard.nextLine(); // Consume newline

        } while (continueOuterLoop == 1); // End of the main "do-while" loop

        System.out.println("Exiting Zoo program. Goodbye!");
        keyboard.close(); // Good practice to close the scanner
    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin"); // --- THIS LINE WAS ADDED ---

        System.out.println("Enter choice of animal (1-3):"); // --- PROMPT UPDATED ---
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }
}