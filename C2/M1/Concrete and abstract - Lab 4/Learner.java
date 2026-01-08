//TODO 12: make Learner class implement Assessments interface
public class Learner implements Assessments {
    
    //TODO 1: declare instance variables
    // Hint: name (String), course (Course), gradeScore (double)

    String name;    
    Course course;
    double gradeScore;


    //TODO 2: create a constructor to initialize instance variables

    Learner(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public String toString() {
        return "Name: " + this.name + " " + "Course: " + this.course.subject.title;
    }

    //TODO 13: override assignmentScore() method
    // Hint: set the assignment marks in the associated Course object

    @Override
    public void assignmentScore(int mark1) {
        this.course.assignmentMarks = mark1;
    }

    //TODO 14: override quizScore() method
    // Hint: set the quiz marks in the associated Course object

    @Override
    public void quizScore(int mark2) {
        this.course.quizMarks = mark2;
    }

    public double calculateGrade() {
        int maxAssignmentMarks, maxQuizMarks;
        
        //TODO 17: calculate gradeScore as per the instructions
        // - For online courses: assignment max = 30, quiz max = 10
        // - For classroom courses: assignment max = 100, quiz max = 30
        // - Compute assignmentGrade and quizGrade out of 10
        // - gradeScore = average of assignmentGrade and quizGrade

        if (this.course.subject.title.contains("Online")) {
            maxAssignmentMarks = 30;
            maxQuizMarks = 10;
        } else {
            maxAssignmentMarks = 100;
            maxQuizMarks = 30;
        }

        double assignmentGrade = ((double) this.course.assignmentMarks * 10) / maxAssignmentMarks;
        double quizGrade = ((double) this.course.quizMarks * 10) / maxQuizMarks;

        this.gradeScore = (assignmentGrade + quizGrade) / 2;

        return this.gradeScore;
    }
}
