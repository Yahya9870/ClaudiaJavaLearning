import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number; // declaration
        do{

            System.out.print("Enter a number: or 0 to exit: ");
            number = input.nextInt(); // taken input from the user thru keyboard
            if(number == 0){
                System.out.println(" Program is over. Good Bye ! ! !");
            }
            else if(number % 2 == 0){
                System.out.println(number +" is even");
            }
            else{
                System.out.println(number +" is odd");
            }


        } while (number != 0);
    }
}
