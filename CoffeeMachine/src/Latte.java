import javax.swing.*;

public class Latte extends Coffee{
    String milkType;
    String syrupflavor;

    public Latte(String name,String roast,double price,String milkType,String syrupflavor){

        super( name,roast,price);
        this.milkType = milkType;
        this.syrupflavor = syrupflavor;
    }
    public void printLatteDetails() {
        System.out.println("Your latte has " + milkType + " milk and " + syrupflavor + " flavor.");
        System.out.println("Your total bill is " + price + "$.");
    }
}