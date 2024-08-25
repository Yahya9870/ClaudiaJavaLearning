import java.util.Scanner;

public class UserInputBasics {

    public static void main(String[] args) {

        // General Steps for taking user input
        // Step 1: import java.util.Scanner;
        // Step 2: Creating an object of Scanner class;
        // Step 3: Taking input with the help of that object;
        // Important Note: You can take multiple inputs with a single object.
        // Best Practice: close the object after use (good programming practice)

        // Write a Java code to display sum of three integers given by user.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Please enter third number: ");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;

        System.out.println("The sum is: " + sum);


        System.out.println("Enter the first double number: ");
        double d1=input.nextDouble();
        System.out.println("Enter the second double number: ");
        double d2=input.nextDouble();
        System.out.println("Enter the third double number: ");
        double d3=input.nextDouble();
        double sum1 = d1 + d2 + d3;
        System.out.println("The sum is: " + sum1);


        input.close();  // clear the memory of that object (not necessary however a good programming practice )





    }
}
