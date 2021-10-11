package naba;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AdvancedArithmetic advancedArithmetic = new MyCalculator();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for find the sum of all divisors : ");
        int a = input.nextInt();
        advancedArithmetic.divisorSum(a);

        System.out.println("\nEnter a number for find the factorial : ");
        int b  = input.nextInt();
        advancedArithmetic.findFactorial(b);

    }
}
