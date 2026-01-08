abstract class Course {

    // TODO 3: Include instance variables and create a constructor to initialize some of them
// Hint: Instance variables: subject (Subject), instructor (String), fee (int), assignmentMarks (int), quizMarks (int)
//       Constructor parameters: (Subject subject, String instructor, int fee) to initialize subject, instructor, and fee
        Subject subject;
        String instructor;
        int fee;
        int assignmentMarks;
        int quizMarks;


        Course(Subject subject,String instructor , int fee){
            this.subject=subject;
            this.instructor=instructor;
            this.fee=fee;
        }
}