import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("What is your current grade percentage? ");
    double percent = scanner.nextDouble();
    System.out.print("What is the weight? ");
    double weight = scanner.nextDouble();
    System.out.print("What is the target letter grade? ");
    String grade = scanner.next();
    int target = 0;
    switch (grade) {
        case "A":
            target = 90;
            break;
        case "B":
            target = 80;
            break;
        case "C":
            target = 70;
            break;
        case "D":
            target = 60;
            break;
        default:
            target = 90;
            break;
    }
    String targetLetter = "";
    double numberGrade = percent + 100 * ((target - percent)/weight);
    if (numberGrade <=100 && numberGrade >=90) {
        targetLetter = "A";
    }
    else if (numberGrade < 90 && numberGrade >= 80){
        targetLetter = "B";
    }
    else if (numberGrade < 80 && numberGrade >= 70) {
        targetLetter = "C";
    }
    else if (numberGrade < 70 && numberGrade >= 60){
        targetLetter = "D";
    }
    System.out.print("You need a " + numberGrade + "% or a (" + targetLetter + ").");
    }
}
