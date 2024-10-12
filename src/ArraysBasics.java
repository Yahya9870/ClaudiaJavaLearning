import java.util.Scanner;

public class ArraysBasics {
    public static void main(String[] args) {
        // Arrays
        // I have given you 5 keys of different cars.

        // Case 1: You have put those 5 keys at different locations in the house such one in kitchen, other in living room, one in backyard and so on.
        // int a,b,c,d,e;  // these five variables will get stored at different locations.


        // Case 2: You have put those keys a box with 5 key slots. (hey we store data in a contiguous manner)
        // if we declare an integer array of size 5 then those element will get stored at adjacent addresses right next to each other unlike int a,b,c,d,e
        // Whenever I ask you pls give key of BMW.
        // in which case accessibility and search time is easy and quick in order to get the right key.

        // What is an array?
        // It's a data structure, that contains similar kind of dataType in a contiguous manner.
        // What is a data structure?
        // It is a design/style in which we can store data (data container).

        // How to declare an array.

        // dataType [] nameOfArray = new dataType[size of array];
            // Array declaration first method
           int [] arr = new int [10];  // we have declared an array of integer dataType and of size 10.
        // Second method
//        int []arr;
//        arr = new int[10];
        // Third method
       // int [] arr = {10,20,30,40,50,60,70,80,90};
//        // range of index starting from 0 and ends at 9
            arr[0] = 1; // first element bcoz counting index in an array always starts from 0 (important)
            arr[1] = 2; // second
            arr[2] = 3; // third
            arr[3] = 4; // fourth
            arr[4] = 5; // fifth
            arr[5] = 6; // sixth
            arr[6] = 7; // seventh
            arr[7] = 8; // eighth
            arr[8] = 9; // ninth
            arr[9] = 10; // tenth
            arr[9] = 11;  // now 10th element in eleven {last updated}
            //arr[10] = 12; // no issues at compile time but run time error
            // compile error (pre-wedding relationship) is better than runtime (married situation )
            // Exceptions: Index 10 out of bounds for length 10 bcoz the maximum index for any array length say n would be n-1 respectively in this specific case max index can be 9 for length 10

           // System.out.println(arr[10]); // dont try this

          //  System.out.println(arr[0]);

            // Ques: How to get the length of the array?
           // Ans: there is one inbuilt method called length
           int arrayLength = arr.length;
           //System.out.println("The length of the array is: "+arrayLength);

           //  declare an array of integer dataType and print all of its element size should 200

          int [] arr2 = new int [5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
//        System.out.println("Enter the first element of the array: ");
//        arr2[0] = sc.nextInt();
//        System.out.println("Enter the second element of the array: ");
//        arr2[1] = sc.nextInt();
        // ... and so on it will take a huge chunk of time and programming

        for (int index = 0; index < arr2.length; index++) {
            System.out.println("Enter index "+(index+1)+" : ");
            arr2[index] = sc.nextInt();
        }


        // Question : display all elements
        // if u print one by one index by index that will be time consuming

        // we will use a for loop here also:

        System.out.println("Here are the elements of the array: ");
        for (int index = 0; index < arr2.length; index++) {
           // System.out.println(arr2[index]); // on different each element
            System.out.print(arr2[index]+" ");

        }



    }
}
