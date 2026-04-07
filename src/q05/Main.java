import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                double circleArea = Math.PI * r * r;
                System.out.println("Area of Circle = " + circleArea);
                break;

            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double b = sc.nextDouble();
                double rectArea = l * b;
                System.out.println("Area of Rectangle = " + rectArea);
                break;

            case 3:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                double triArea = 0.5 * base * h;
                System.out.println("Area of Triangle = " + triArea);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        //
        // Input: circle 7      → Output: Area: 153.94
        // Input: rectangle 4 5 → Output: Area: 20.00
        // Input: triangle 3 4 3→ Output: Area: 6.00

    }
}
