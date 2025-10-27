/*public class condi {
    public static void main(String[] args) {
       int numberBeingChecked = 5;
         if( numberBeingChecked >5 ) {
             System.out.println("The number: " + numberBeingChecked + " is > 5");
             }
        else {
            System.out.println("The number: " + numberBeingChecked + " is <= 5");
        }
    }
    
}

            //Additional conditions


public class condi {
    public static void main(String[] args) {

        int dollarsToSpareInPocketToday = 2;

        if( dollarsToSpareInPocketToday >= 15 ) {
            System.out.println("I will go to the Movies");
        } else {
            if(dollarsToSpareInPocketToday >= 3) {
                System.out.println("I will go to a Cafe for a cup of coffee.");
            } else {
                System.out.println("I will chill at home.");
            }
        }
    }
}


public class condi {
    public static void main(String[] args) {

        int dollarsToSpareInPocketToday = 300;

        if (dollarsToSpareInPocketToday < 300) {
            System.out.println("I will go to my parents place. No diversions.");
        } else {

            boolean interestedInLuckAndFun = true;

            if (interestedInLuckAndFun) {
                System.out.println("I will go to Las Vegas.");
            } else {
                
                boolean interestedInHistory = true;

                if (interestedInHistory) {
                    System.out.println("I will visit Hoover Dam");
                } else {
                    System.out.println("I will visit Area 51 and observe some aliens.");
                }

            }
        }
    }
}


public class condi {
   public static void main(String[] args) {
       //marks between 1 and 100
       int marks = 75;

       if(marks > 60) {
           System.out.println("Pass.");
       } else {
           System.out.println("Fail.");
       }

   }
}*/


public class condi {
    public static void main(String[] args) {
        // the amount of spare money you have
        int dollarsToSpareInPocketToday = 301;
        
        // checking if interested in games based on luck
        boolean interestedInLuckAndFun = false;
        
        // checking if interested in history
        boolean interestedInHistory = false;
        
        // checking if the amount of money is less than 300
        if (dollarsToSpareInPocketToday < 300) {
            System.out.println("I will go to my parent’s place. No diversions.");
        }
        
        // checking if the amount of money is greater than 300 and interested in Luck
        if (dollarsToSpareInPocketToday > 300 && interestedInLuckAndFun == true && interestedInHistory == false) {
            System.out.println("I will go to Las Vegas.");
        }
        
        // checking if the amount of money is greater than 300 and interested in History
        if (dollarsToSpareInPocketToday > 300 && interestedInLuckAndFun == false && interestedInHistory == true) {
            System.out.println("I will visit Hoover Dam");
        }
        
        // checking if the amount of money is greater than 300 and not interested in Luck and not interested in history
        if (dollarsToSpareInPocketToday > 300 && interestedInLuckAndFun == false && interestedInHistory == false) {
            System.out.println("I will visit Area 51 and observe some aliens.");
        }
    }
}