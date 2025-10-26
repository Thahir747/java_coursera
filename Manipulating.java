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
}*/

public class Manipulating {
	public static void main(String[] args) {
    	String testString = "  This is a test	";
    	String result1 = testString.trim(); // results in “This is a test”
 
    	System.out.println("testString : #" + testString + "#");
        System.out.println("testString.trim() : #" +  testString.trim() + "#");
 
	}
}


