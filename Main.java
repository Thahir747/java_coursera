/*class Stringlength{
    public static void main(String[] args) {
        String fruit="Banana";
        char length=fruit.charAt(0);

        System.out.println("Length of " + fruit + " is " + length +"!");

    }
}

/*class Stringlength {
    public static void main(String[] args) {
        String name="Femiya";

        String res1 =name.toUpperCase();
        String res2 = name.toLowerCase();

        System.out.println( "After uppercase is applied: " + res1);

        System.out.println("Afer lowercase is applied: " + res2);


    }
}

public class Main {
    public static void main(String args[]) {
        String  firstName ="Harry";
        String lastName = "Grow";
        String email = "harry.grow@example.com";

        String username= (firstName+lastName).toLowerCase(); 

        System.out.println("username is:" + username);

        String replc =email.replace("example", "gmail");

        System.out.println("new email is: " + replc);


        System.out.println("index at: " + email.indexOf ('@'));
    }
}

public class Main {

    public static void main(String[] args) {
        String bookTitle = "The Adventures of Captain Fantastic and the Magical Unicorn";
        int titleLength = bookTitle.length();
        System.out.println("Length of the book title: " + titleLength);

        //Declare and initialise the length of shortened book title
        int maxLength = 20;


        // Shortened the book title
        String shortBookTitle = bookTitle.substring(0, 20);
        System.out.println("\nnew title is: " + shortBookTitle);

        System.out.println("\nLength is: " + shortBookTitle.length());
        System.out.println("\nOriginal title: " + bookTitle);
        System.out.println("\nShortened title: " + shortBookTitle);

        // Declare and initialize the searchWord
        String searchWord = "Captain";

        // Check if the searchWord is present in book title
        boolean containsWord = shortBookTitle.contains(searchWord);
        System.out.println("\nDoes the title contain the word \"" + searchWord + "\"? " + containsWord);
    }
}

 

 class Main {
    public static void main(String[] args) {
        String words ="Java programming is fun and educational";

        boolean check=words.contains("fun");
        System.out.println("Is that word contains: "+ check);

        String repl =words.replace("educational", "awesome!");

        System.out.println("New sentence is: "+ repl);

        int length = repl.length();

        System.out.println("New length is: "+ length);

        String sh =repl.substring(0, 17);

        int len2=sh.length();

        System.out.println("Len2: "+ len2);


    }
 }*/

 public class Main {

    public static void main(String[] args) {
        // Declare and initialize an array of superhero names
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Declare and initialize an array of years
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Print the superhero names
        System.out.println("Superhero Names:");
        for( String hero : superheroes)
            System.out.println(hero);

        // Print the introduction years
        System.out.println("Introduction Years:");
        for (int year: introductionYears)
            System.out.println(year);
        System.out.println(superheroes[2]);

        superheroes[2]="Thor";  // TODO 3b: Modify the third superhero name
        System.out.println(superheroes[2]); // TODO 3c: Print the modified name of the third superhero
        
        System.out.println("modified superhero's original year of introduction: " + introductionYears[2]);  // TODO 4a: Print the original year of introduction of the third superhero
        
        introductionYears[2]=2011;   // TODO 4b: Modify the year of introduction of the third superhero
        System.out.println("year of the modified superhero’s introduction: "+ introductionYears[2]);    // TODO 4c: Print the modified year of introduction of the third superhero

        
        System.out.println("Total Length of heroes:" + superheroes.length);        // TODO 5a: Print the length of the array containing superhero names


        System.out.println("Total Length of years:" +introductionYears.length);        // TODO 5b: Print the length of the array containing superhero year of introduction

        // checking github



    }
}


