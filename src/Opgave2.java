public class Opgave2 {

    int assignmentPoints;
    int examPoints;
    int projectPoints;

    int addAssignmentPoints(int points) {
        assignmentPoints += points;
        return assignmentPoints;
    }

    int addExamPoints(int points) {
        examPoints += points;
        return examPoints;
    }

    int addProjectPoints(int points) {
        projectPoints += points;
        return projectPoints;
    }

    void printTotal() {
        int totalPoints = assignmentPoints + examPoints + projectPoints;
        System.out.println("Total points: " + totalPoints);
    }

    void main() {
        System.out.println("Assignments points: " + addAssignmentPoints(25));
        System.out.println("Exam points: " + addExamPoints(40));
        System.out.println("Project points: " + addProjectPoints(30));
        printTotal();
    }



}
