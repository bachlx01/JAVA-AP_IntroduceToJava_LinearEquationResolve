import java.util.Scanner;

public class LinearEquationResolve {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolve");
        System.out.println("Give an equation as 'a*x+b=0', Please enter constants");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        Double a = scanner.nextDouble();

        System.out.println("Enter b: ");
        Double b = scanner.nextDouble();

        if (a==0){
            if (b==0){
                System.out.println("The solution id all of x");
            } else {
                System.out.println("No solution!");
            }
        } else {
            System.out.println("Equation pass with: " + (-b)/a);
        }
    }
}
