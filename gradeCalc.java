import java.util.*;

public class gradeCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter current grade(To the 2 decimals): ");
        float current = input.nextFloat();

        System.out.println("Goal Grade: ");
        float goal = input.nextFloat();

        float required = mathCalc(current, goal);
        System.out.println("You will need a " + goal + " percent on the assignment");

    }

    public static float mathCalc(float current, float goal) {
        float required = (2 * goal) - current;
        return required;
    }
}

/*
 * to run do:
 * javac gradeCalc.java
 * then do:
 * java gradeCalc
 */