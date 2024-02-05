import java.util.Scanner;
public class LargestOfThreeNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter the third number: ");
        double num3 = scanner.nextDouble();
        double largest = findLargest(num1, num2, num3);
        System.out.println("The largest number is: " + largest);
        scanner.close();
    }
    public static double findLargest(double a, double b, double c) 
        {
        if (a >= b && a >= c) 
            {
                return a;
            } 
            else if (b >= a && b >= c) 
            {
                return b;
            } 
            else 
            {
                return c;
            }
         }
}