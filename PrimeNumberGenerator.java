import java.util.Scanner;
public class PrimeNumberGenerator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        printPrimesInRange(start, end);

        scanner.close();
    }
    public static void printPrimesInRange(int start, int end) 
    {
        for (int number = start; number <= end; number++) 
        {
            if (isPrime(number)) 
            {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // Move to the next line after printing primes
    }

    public static boolean isPrime(int num) 
    {
        if (num < 2) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}
