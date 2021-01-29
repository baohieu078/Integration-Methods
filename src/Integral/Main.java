package Integral;

import java.util.Scanner;

/*-----------------------------------------------------------
 Written by Truong Lam Bao Hieu (27.01.2021)
 ------------------------------------------------------------- */

public class Main {
 
    public static void Menu(){
        System.out.println("-------------------------------------------");
        System.out.println("Calculate the integral of f(x)dx");
        System.out.println("1. f(x) = [(4x-1)/(sqrt(2x+1)+2)]dx from 0 to 4");
        System.out.println("2. f(x) = [sin(x-pi/4) / (sin2x + 2(1 + sinx + cosx))]dx from 0 to pi" );
        System.out.println("3. f(x) = ln(x)/x³ dx from 1 to 2");
        System.out.println("x. Exit");
        System.out.println("Choose the function you want to integrate:\n");
    }

    public static void main(String[] args) throws Exception{

        int indx;
        int n = 1000;
        String input = "";
        String again = "";

        Scanner scanner = new Scanner(System.in);

        Menu();

        while(!input.equalsIgnoreCase("x")){
            double a, b;
            double answer;
            double LeftRiemannSum, RightRiemannSum;
            input = scanner.nextLine().trim();
            switch (input) {
                case "1":
                    indx = 1 ;
                    System.out.println("\nf(x) = [(4x-1)/(sqrt(2x+1)+2)]dx from 0 to 4");
                    a = 0.0;
                    b = 4.0;
                    LeftRiemannSum = Function.leftRiemannSum(n,a,b, indx);
                    RightRiemannSum = Function.rightRiemannSum(n,a,b, indx);
                    answer = Function.Average(LeftRiemannSum,RightRiemannSum);
                    System.out.println("\nIntegral ≈ " + answer);
                    System.out.println("Do you want to continue? (Y/N)");
                    break;


                case "2":
                    indx = 2;
                    System.out.println("\nf(x) = [sin(x-pi/4) / (sin2x + 2(1 + sinx + cosx))]dx from 0 to pi");
                    a = 0.0;
                    b = pi;
                    LeftRiemannSum = Function.leftRiemannSum(n,a,b,indx);
                    RightRiemannSum = Function.rightRiemannSum(n,a,b, indx);
                    answer = Function.Average(LeftRiemannSum,RightRiemannSum);
                    System.out.println("\nIntegral ≈ " + answer);
                    System.out.println("Do you want to continue? (Y/N)");
                    again = scanner.nextLine().trim();
                    if (again.equals("Y")){
                        Menu();
                    }
                    else {
                        break;
                    }

                case "3":
                    indx = 3;
                    System.out.println("\nf(x) = ln(x)/x³ dx from 1 to 2");
                    a = 1.0;
                    b = 2.0;
                    LeftRiemannSum = Function.leftRiemannSum(n,a,b,indx);
                    RightRiemannSum = Function.rightRiemannSum(n,a,b,indx);
                    answer = Function.Average(LeftRiemannSum,RightRiemannSum);
                    System.out.println("nIntegral ≈ " + answer);
                    System.out.println("Do you want to continue? (Y/N)");
                    again = scanner.nextLine().trim();
                    if (again.equals("Y")){
                        Menu();
                    }
                    else {
                        break;
                    }

                case "x":
                    break;

                default:
                    System.out.println("Your selection is not valid!");
                    System.out.println("Please try again!\n\n");
                    Menu();

            }
            System.out.println("\nSee you soon ^^");
        }

    }
}
