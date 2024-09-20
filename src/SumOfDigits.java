import java.util.Scanner;

public class SumOfDigits
{
    public static void main(String[] args) {
        // Write a Java Program to find sum of digits pof an int value given by user.
        // if user enters 1234 = 1+2+3+4=10

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        int r;
 //with the pf while loop
        // num= 1   0   2  3
        while (num != 0) {
            // 1. sum=0+3=3
            // 2. sum=3+2=5
            // 3. sum=5+0=5
            // 4. sum=5+1=6
            // 5. loop terminates
            r=num%10;
            sum = sum+ r; // sum=sum+num%10;
            num /= 10;       // num=num/10;

        }
        System.out.println("The sum of digits of the int given by user is: "+sum);
        System.out.println("This is by while loop");

        // with for loop
        for (int i = num; i !=0;i=i/10 ) {
            sum += i%10;



        }

        System.out.println("The sum of digits of the int given by user is: "+sum);
        System.out.println("By for loop");

    }
}
