import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the terms of the sequence: ");
        int n = input.nextInt();
        int a = 0; // first term
        int b = 1; // second term
        int c;     // third term
        System.out.println("The fibonacci sequence is: ");

        for (int i = 0; i <n ; i++) {   // 1. a=0; c=0+1=1; a=1; b=1
                                        // 2. a=1; c=1+1=2; a=1; b=2
                                        // 3. a=1; c=1+2=3; a=2; b=3
                                        // 4. a=2; c=2+3=5; a=3; b=5
                                        // 5. a=3; c=3+5=8; a=5; b=8
                                        // 6. a=5; c=5+8=13; a=8; b=13
                                 // Output on console: 0,1,1,2,3,5
            System.out.print(a+" ");
            c = b + a;
            a = b;
            b = c;


        }
    }
}
