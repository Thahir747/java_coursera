import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Car myFirstCar= new Car();

        myFirstCar.make="Honda";
        myFirstCar.model="cvt";
        myFirstCar.color="white";
        myFirstCar.year=2020;

        myFirstCar.getCarDetails();

        Car[] cars=new Car[2];

        Scanner keyboard = new Scanner(System.in);

        for (int index=0;index<2;index++){
            cars[index]=new Car();

            System.out.println("Enter car details: ");

            System.out.println("Make: ");
            cars[index].make=keyboard.nextLine();

            System.out.println("Model: ");
            cars[index].model=keyboard.nextLine();
            System.out.println("Color: ");
            cars[index].color=keyboard.nextLine();
            System.out.println("Year: ");
            cars[index].year=keyboard.nextInt();

            keyboard.nextLine();
        }
        System.out.println("Car details are:");
        for (int index=0;index<2;index++){
            String carDetails=cars[index].getCarDetails();
            System.out.println(carDetails);
        }
    }
}
