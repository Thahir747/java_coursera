public class KitchenHelper3 {
    public static void greetGuest(String name, String timeOfDay)
    {
        if(timeOfDay.equals("Morning")){
            System.out.println("Hi harry, Good morning!");
        }else if(timeOfDay.equals("Afternoon")){
                System.out.println("Hi harry, Good afternoon!");
        }else{
            System.out.println("Hi harry, Good night!");
            }
    }
        // Your code here!
        // Print a personalized greeting based on arguments
	    // For example, Hi Bob, Good Afternoon!
    

    public static void main(String[] args) {
    	// calling the method
        // Replace these arguments with your own values
        
        greetGuest("Harry", "dfvf");
    }
}
