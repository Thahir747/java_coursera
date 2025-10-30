public class KitchenHelper4 {
    public static double calculateIngredientQuantity(int servings,double originalQuantity)
    {
        double adjustedQuantity = originalQuantity * servings;
        return adjustedQuantity;
    }
    public static void spiceUpDish(int spiceLevel){
        switch (spiceLevel){
            case 1:
                System.out.println("normal");
                break;
            case 2:
                System.out.println("thiki");
                break;
            case 3:
                System.out.println("salt");
                break;
            default:
                System.out.println("Invalid spice level. Please enter a number between 1 and 5.");

                break;
        }
    }

    public static void greetGuest(String name, String timeOfDay){
        if(timeOfDay.equals("Morning")){
            System.out.println("Hi harry, Good morning!");
        }else if(timeOfDay.equals("Afternoon")){
                System.out.println("Hi harry, Good afternoon!");
        }else{
            System.out.println("Hi harry, Good night!");
        }
    }

    public static void main(String[] args) {

        double newQuantity = calculateIngredientQuantity(2, 3);
        System.out.println("The adjusted ingredient quantity is: " + newQuantity);

        spiceUpDish(2);
        greetGuest("guest", "time");
    }
}