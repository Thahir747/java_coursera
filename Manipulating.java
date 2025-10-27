
// String manipulation    

/*public class Manipulating {
    public static void main(String[] args) {

    	String welcomeToJavaString = "Welcome java";
    	// “welcomeToJavaStringInUpperCase” will be “WELCOME JAVA”
    	String welcomeToJavaStringInUpperCase = welcomeToJavaString.toUpperCase();
 
    	System.out.println("The string  " + welcomeToJavaString  + " in upper case is : " + welcomeToJavaStringInUpperCase );
	
    }
    
}


public class Manipulating {
	public static void main(String[] args) {
    	// “welcomeUseDirectString” is now "Welcome java"
    	String welcomeUseDirectString = "Welcome java".toUpperCase();
 
    	System.out.println("The string Welcome java in upper case is : " + welcomeUseDirectString );
 
	}
}

					// Identify a String

public class Manipulating {
	public static void main(String[] args) {
    	String testString = "This is a test";
 
    	boolean result1 = testString.startsWith("test"); // false
    	boolean result2 = testString.startsWith("This"); // true
 
        System.out.println("testString.startsWith(\"test\") : " + testString.startsWith("test"));
        System.out.println("testString.startsWith(\"This\") : " + testString.startsWith("This"));
 
	}
}


public class Manipulating {
	public static void main(String[] args) {
    	String testString = "This is a test";
 
    	boolean result1 = testString.startsWith("test"); // false
    	boolean result2 = testString.startsWith("This"); // true
 
        System.out.println("testString.startsWith(\"test\") : " + result1);
        System.out.println("testString.startsWith(\"This\") : " + result2);
 
	}
}

		//Checking for empty Strings

public class Manipulating {
	public static void main(String[] args) {
    	String testString1 = "This is a test";
    	String testString2 = "";
 
    	boolean stringEmpty1 = testString1.isEmpty(); // false
    	boolean stringEmpty2 = testString2.isEmpty();  // true
 
 
        System.out.println("testString1.isEmpty() : " + testString1.isEmpty());
        System.out.println("testString2.isEmpty() : " + testString2.isEmpty());
 
	}
}

		//Manipulate a String with index numbers

public class Manipulating {
	public static void main(String[] args) {
    	String testString = "This is a test which is nice";
    	int indexOfSearch1= testString.indexOf("Java"); // returns -1
    	int indexOfSearch2 = testString.indexOf("is"); // returns 2
    	int indexOfSearch3 = testString.indexOf("est"); // returns 11
 
        System.out.println("testString.indexOf(\"Java\") : " + testString.indexOf("Java"));
        System.out.println("testString.indexOf(\"is\") : " + testString.indexOf("is"));
        System.out.println("testString.indexOf(\"est\") : " + testString.indexOf("est"));
 
	}
}

public class Manipulating {
	public static void main(String[] args) {
    	String testString = "This is a test";
    	String result1 = testString.substring(0,6);  //”s is a test”
    	String result2 = testString.substring(12); // “st”
 
        System.out.println("testString.substring(3) : " + result1);
        System.out.println("testString.substring(12) : " + testString.substring(12));
 
	}
}

public class Manipulating {
	public static void main(String[] args) {
    	String testString = "  This is a test	";
    	String result1 = testString.trim(); // results in “This is a test”
 
    	System.out.println("testString : #" + testString + "#");
        System.out.println("testString.trim() : #" +  testString.trim() + "#");
 
	}
}

		//Compare Strings

public class Manipulating {
	public static void main(String[] args) {
    	String testString = "Java";
 
    	boolean result1 = testString.equalsIgnoreCase("java"); //true
    	boolean result2 = testString.equalsIgnoreCase("JAVA"); //true
 
        System.out.println("testString.equalsIgnoreCase(\"java\") : " + testString.equalsIgnoreCase("java"));
        System.out.println("testString.equalsIgnoreCase(\"JAVA\") : " +  testString.equalsIgnoreCase("JAVA"));
	}
}

public class Manipulating {
	public static void main(String[] args) {
    	String testString = "Java is amazing";
 
    	boolean result1 = testString.equals("Java  amazing"); //true
    	boolean result2 = testString.equalsIgnoreCase("JAVA"); //true
 
        System.out.println("testString.equalsIgnoreCase(\"java\") : " + result1);
        System.out.println("testString.equalsIgnoreCase(\"JAVA\") : " +  testString.equalsIgnoreCase("JAVA"));
	}
}

public class Manipulating {
	public static void main(String[] args) {
    	String testString = "Java";
 
    	// non-zero is not equal and zero means equal
    	int result1 = testString.compareTo ("java"); // returns -32
    	int result2 = testString.compareTo("JAVA"); // returns 32
 
    	int result3 = testString.compareToIgnoreCase("java"); // returns 0
    	int result4 = testString.compareToIgnoreCase("JAVA"); // returns 0
 
 
    	System.out.println("------- Comparing with respect to case ----------");
        System.out.println("testString.compareTo (\"java\") : " + testString.compareTo ("java"));
        System.out.println("testString.compareTo(\"JAVA\") : " +  testString.compareTo("JAVA"));
 
    	System.out.println("------- Comparing irrespective of case ----------");
        System.out.println("testString.compareToIgnoreCase(\"java\") : " + testString.compareToIgnoreCase("java"));
        System.out.println("testString.compareToIgnoreCase(\"JAVA\") : " +  testString.compareToIgnoreCase("JAVA"));
 
	}
}



		// Identify a password


public class Manipulating {
	public static void main (String[] args){
		String password="secRetOfM3*@";

		if(password.equals("secRetfM3*@")){

			System.out.println("Welcome");
		}else{
			System.out.println("Wrong password");
		}

	}
}


public class Manipulating {
    public static void main(String[] args) {

        String password = "secRetO3*@";

        if(password.compareTo("secRetO3*@") == 0 ) {
            System.out.println("Welcome");
        }else{
			System.out.println("Wrong password");
		}
    }
}


		//Determine if a String is empty


public class Manipulating {
    public static void main(String[] args) {

        String testString = "";

        if( testString.isEmpty() ) {
            System.out.println("The String is empty");
        }else{
			System.out.println("Welcome");
		}
    }
}

		//Determine if a String contains a substring

public class Manipulating {
    public static void main(String[] args) {

        String fullName = "Tim Berners Lee";
        String familyName = "Leee";

        if( fullName.contains(familyName) ) {
            System.out.println("The family name " + familyName + " exists in the name " + fullName);
        }else{
			System.out.println("Not found!!!");
		}
    }
}

			//Compare two Strings

public class Manipulating {
    public static void main(String[] args) {

        String testString1 = "This is java";
        String upperCaseTestString1 = testString1.toUpperCase();

        //this will not execute
        if( testString1.equals(upperCaseTestString1) ) {
            System.out.println("Value of testString1 is equal to is uppercase version");
        }

        String testString2 = "THIs IS JAVA";
        String upperCaseTestString2 = testString2.toUpperCase();

        //this will execute
        if( testString2.equals(upperCaseTestString2) ) {
            System.out.println("Value of testString2 is equal to is uppercase version");
        }
    }
}


public class Manipulating {
	public static void main (String[] args) {
		String text = "He has a good reputation";

		if(text.contains("good")){
			System.out.println("You get a gift from Santa");
		}else{
			System.out.println("Next year, please");
		}
	}
}*/

public class Manipulating {
	public static void main(String[] args){
		String text1= "Cena";
		String text2= "cEna";

		if (text1.equals(text2)) {
			System.out.println("The names are the same.");
		}else{
			System.out.println("Not same");
		}

	}
}



