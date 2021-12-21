import java.math.*;
import java.util.Scanner;

public class task {
    //A quadratic equation a x² + b x + c = 0 has either
    // 0, 1, or 2 distinct solutions for real values of x.
    // Given a, b and c, you should return the number of
    // solutions to the equation.

    public static int quadratic(int a, int b, int c) {
        //x = (-b +- sqrt(b^2 - 4ac))/2a

        //square root of negative number leads to imaginary solutions
        if (((b*b) - (4*a*c)) < 0)
            return 0;

        //find two solutions for x
        double x_pos = (-b + Math.sqrt((b*b) - (4.0*a*c)))/(2.0*a);
        double x_neg = (-b - Math.sqrt((b*b) - (4.0*a*c)))/(2.0*a);

        //if both solutions are equal, then there is only one solution
        if(x_pos == x_neg)
            return 1;

        //otherwise both solutions are real and distinct
        return 2;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scnr.nextInt();
        System.out.print("Enter b: ");
        int b = scnr.nextInt();
        System.out.print("Enter c: ");
        int c = scnr.nextInt();

        int numSolutions = quadratic(a,b,c);
        System.out.println("Number of real solutions: " + numSolutions);
    }
}
