import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // In other programming languages, we say functions like python, c++, etc.
        // In java we call the same as methods.
        // What is a method?
        // Code snippet of a certain task in order to increase reusability of the code and reduce codebase work.

        // Write a java program to add two numbers:

//        int num1=2;
//        int num2=3;
//        int sum=num1+num2;
//        System.out.println(sum);

        /* anonymous coding

        anonymous coding
        anonymous coding
        anonymous coding
         */

        // calling method claudia

//        claudia();
//        claudia();
//        claudia();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Hello Claudia pls enter your age: ");
//          int age= sc.nextInt();
         // claudia2(age);

      //  System.out.println(add(2,3,5));

        int result=add(4,7,9);
        System.out.println(result);



    }





    // There basically 3 type of methods:
    // 1. Non-returning and non parametrized.
    // 2. Non-returning and parametrized.
    // 3. Returning and parametrized.



    //

        // defining a method:
    // 1. Non-returning and non parametrized.

//    public static void claudia(){
//        System.out.println("Here is the information of the desired person: ");
//        System.out.println("My name is Claudia");
//        System.out.println("I am 19 years old");
//        System.out.println("I am from Austria");
//        System.out.println("I speak Deutsch");
//        System.out.println("I love Indian food like dal and rice, chana masala");
//        System.out.println();
//        System.out.println("-----------------------------------------------------------------------------------------------");
//    }/

    // 2. Non-returning and parametrized.

//    public static void claudia2(int age){
//        System.out.println("Your age is " + age);
//        if(age<18){
//            System.out.println("You are a minor");
//        } else if (age>=18) {
//            System.out.println("You are an adult");
//
//        }
//    }

    // 3. Returning and parametrized. (Important)

    public static int add(int a, int b, int c) {
        int sum = a + b + c;

        return sum;
    }




}



