/*public class conditional {
    public static void main(String[] args) {
        int moneyLeftWithToni = 299;
        if (moneyLeftWithToni >= 300) {
            System.out.println("Go to Las Vegas");
            System.out.println("Enjoy some luck games");
            System.out.println("Enjoy some concerts");
            System.out.println("Enjoy fine dining");
            System.out.println("Go on a helicopter ride");
            System.out.println("Go shop some souvenirs");

        } else if(moneyLeftWithToni>=200 && moneyLeftWithToni<300) {
            System.out.println("Hoover Dam");
        }else if(moneyLeftWithToni>=100 && moneyLeftWithToni<200){
            System.out.println("Area 51");
        }else if(moneyLeftWithToni>=50 && moneyLeftWithToni<100){
            System.out.println("have ice cream");
        }
        System.out.println("On trip to parents.");
    }
}*/

public class conditional {
    public static void main(String[] args) {
        int moneyLeftWithToni = 301;
        if (moneyLeftWithToni >= 300) {
            System.out.println("Go to Las Vegas");
            System.out.println("Enjoy some luck games");
            System.out.println("Enjoy some concerts");
            System.out.println("Enjoy fine dining");
            System.out.println("Go on a helicopter ride");
            System.out.println("Go shop some souvenirs");

        } else if(moneyLeftWithToni>=200) {
            System.out.println("Hoover Dam");
        }else if(moneyLeftWithToni>=100){
            System.out.println("Area 51");
        }else if(moneyLeftWithToni>=50){
            System.out.println("have ice cream");
        }else{
            System.out.println("Think about money....");
        }
        System.out.println("On trip to parents.");
    }
}