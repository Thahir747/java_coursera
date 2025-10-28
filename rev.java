public class rev {
    public static void main(String[] args) {
        String stringToReverse = "TONI says ice cream PER scoop";
        String reversed = "";
        for(int indexPosition = stringToReverse.length() - 1; indexPosition >= 0; indexPosition--) {
            char ch = stringToReverse.charAt(indexPosition);
            reversed = reversed + ch;
        }
        System.out.println("The reverse of " + stringToReverse + " is:....... " + reversed);
    }

}
