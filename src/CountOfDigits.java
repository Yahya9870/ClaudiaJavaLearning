import java.util.Scanner;

public class CountOfDigits {
    public static void main(String[] args) {
        // WAP to ask user to enter a number and you have tell how many digits that
        // number consist
        // Sample input: 12345
        // Sample output: 5
        // Sample input: 8675
        // Sample output: 4



        // if you do %10 with any number in the world then it would give last digit of that number:
        // for example: 1234%10=4,  5437%10=7, 5278%10=8

        // if you do /10 with any number then it will eliminated last digit of that number
        // for example: 1234/10=123,  6278/10=627,  4389/10=438
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();



        int countOfDigits = 0;
        if(number==0){
            countOfDigits=1;
        }
        // say user enter    0 1   2  3    4      5
        while (number != 0) {


            number=number/10;
            countOfDigits++; // 1,2,3,4,5
        }
        System.out.println("The digits in the given number is "+countOfDigits);


    }
}


// HomeWork:
// WAP to get SumOfDigits of a number entered by user:
// Sample Input: 1234
// Sample Output: 1+2+3+4=10

// Input: 2357
// Output: 17
