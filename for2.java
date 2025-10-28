public class for2{
    public static void main(String[] args){
        String stringToTravel="TONI says ice cream PER scoop";
        int vowels=0;

        int stringToTravelL=stringToTravel.length();
        System.out.println("total count: " + stringToTravelL);

        stringToTravel=stringToTravel.toLowerCase();

        for( int indexPosition=0;indexPosition<stringToTravel.length();indexPosition++){
            char ch=stringToTravel.charAt(indexPosition);
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowels++;
                }
        }
        System.out.println("The total number of vowels in the String is: " + vowels);
        System.out.println("Remaining letters are: " + (stringToTravel.length() - vowels) );
    }

}
