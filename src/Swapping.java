import java.util.Scanner;

public class Swapping



{
    public static void main(String[] args) {
        // Write a Java Program to swap two integers.

        // Part 1: With the help of third variable
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int a=input.nextInt();
//        System.out.println("Enter the second number: ");
//        int b= input.nextInt();
//        int temp; // a third variable like an empty glass
//        System.out.println("The actual values of a and b are: "+a+" and "+b);
//        temp=a;
//        a=b;
//        b=temp;
//
//        System.out.println("The swapped values of a and b are: "+a+" and "+b);

        // Part 2: Without using a 3rd variable.

        int a=11,b=22;  // user defined or hard coded values

        // Swapping using arithmetic logic of addition and subtraction.
//        System.out.println("The actual values of a and b are: "+a+" and "+b);
//        a=a+b;
//        b=a-b; // a+b-b == a  // b=a
//        a=a-b; // a+b-(a) == b // a=b
//        System.out.println("The Swapped values of a and b are: "+a+" and "+b);

        // Swapping using arithmetic logic of multiplication and division.
        System.out.println("The actual values of a and b are: "+a+" and "+b);
        a=a*b;  // eq ----- 1
        b=a/b; // (a*b)/(b) == a  // b=a  eq ------ 2
        a=a/b; // (a*b)/(a) == b // a=b   eq ------ 3
        System.out.println("The Swapped values of a and b are: "+a+" and "+b);
    }


}
