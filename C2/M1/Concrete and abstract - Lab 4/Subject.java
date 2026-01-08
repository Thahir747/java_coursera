class Subject {

     // TODO 4: Declare instance variables and create a constructor to initialize them
    // Hint: Use instance variables `title` (String)
    // and `credits` (double) to declare instance variable, 

    String title;
    double credits;

    // and a constructor with parameters (String title, double credits)

    Subject(String title,double credits){
        this.title=title;
        this.credits=credits;
    }



    //TODO 5: define toString() method
    // Hint: return a string representation of the Subject object

    public String toString(){
        return "Title: " + this.title + " " + "Credits: " + this.credits;
    }
}
