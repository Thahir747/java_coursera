public class KitchenHelper2{
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

    public static void main(String[] args) {
    	// calling the method
        // Replace this argument with your own value
        
        spiceUpDish(3);
    }
}