import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // What is a Palindrome Number?
        // Any integer whose reverse is identical to its actual number then it is called a palindrome number.
        // for example 1221
        // 3775773  rev = 3775773

        // With the help of Palindrome Number concept, you will learn three programming concepts.
        // 1. Palindrome Number.
        // 2. How to get a reverse of a number.
        // 3. Armstrong number.

        // Reverse Number Topic
        // if there is a number say 5 and you have to add 3 on the right hand side of the it then we will multiply 5 by 10 then add whatever we want in this case 3 == 5X10+3=53

//        int num = 1234;
//        int save=num;
//        int rev=0;
//        int r; // remainder we get after doing %10 with the desired number
//        //     1    2      3    4
//        while(num!=0) {
//            r = num%10; // gives last digit of that number
//            rev = rev*10+r; // 1. r=4 2. r=43  3. 4321
//            num = num/10; // eliminates last digit of a given number
//
//        }
//
//
//        System.out.println("The reverse of "+save+" is "+rev);

        // Palindrome Number:

        Scanner input = new Scanner(System.in);
        System.out.print("Hello Mr. User Plz enter a number: ");

        int num = input.nextInt();
        int save=num;
        int rev=0;
        int r; // remainder we get after doing %10 with the desired number
        //     1    2      3    4
        while(num!=0) {
            r = num%10; // gives last digit of that number
            rev = rev*10+r; // 1. r=4 2. r=43  3. 4321
            num = num/10; // eliminates last digit of a given number

        }


       if(rev==save){
           System.out.println("Palindrome");
       }

       else{
           System.out.println("Not Palindrome");
       }




    }


}
