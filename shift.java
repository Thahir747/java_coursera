/*public class shift {
    public static void main(String[] args) {

        // set the speed in Mph
        int carSpeed =81;


        // 1st level "if" condition
        if (carSpeed<17) {
            System.out.println("1st Gear.");
        } else {
            // 1st level "else" of 1st level "if"

            //2nd level "if" condition inside 1st level "else"
            if (carSpeed<33) {
                System.out.println("2nd Gear.");
            } else {
                // 2nd level "else" of 2nd level "if"

                //3rd level "if" condition inside 2nd level "else"
                if ( carSpeed<49) {
                    System.out.println("3rd Gear.");
                } else {
                    //3rd level "else" of 3rd level "if"

                    //4th level "if" condition inside 3nd level "else"
                    if(carSpeed<65) {
                        System.out.println("4th Gear.");
                    } else {
                        //4th level "else" of 4th level "if"

                        //5h level "if" condition inside 4th level "else"
                        if(carSpeed<81 ) {
                            System.out.println("5th Gear.");
                        } else {
                            //5th level "else" of 5th level "if"

                            System.out.println("SLOW DOWN BOSS.");
                        }
                    }
                }

            }
        }
    }
}*/

public class shift{
    public static void main(String[] args){
       int x = 2;
        switch (x) {
            case 2:
                System.out.print("A ");
            case 4:
                System.out.print("B ");
            case 12:
                System.out.print("C ");
            default:
                System.out.print("D ");
}
    }
}