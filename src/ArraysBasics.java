public class ArraysBasics {
    public static void main(String[] args) {
        // Arrays
        // I have given you 5 keys of different cars.

        // Case 1: You have put those 5 keys at different locations in the house such one in kitchen, other in living room, one in backyard and so on.

        // Case 2: You have put those keys a box with 5 key slots. (hey we store data in a contiguous manner)

        // Whenever I ask you pls give key of BMW.
        // in which case accessibility and search time is easy and quick in order to get the right key.

        // What is an array?
        // It's a data structure, that contains similar kind of dataType in a contiguous manner.
        // What is a data structure?
        // It is a design/style in which we can store data (data container).

        // How to declare an array.

        // dataType [] nameOfArray = new dataType[size of array];
            // Array declaration first method
         //   int [] arr = new int [10];  // we have declared an array of integer dataType and of size 10.
        // Second method
//        int []arr;
//        arr = new int[10];
        // Third method
        int [] arr = {10,20,30,40,50,60,70,80,90};
//        // range of index starting from 0 and ends at 9
//            arr[0] = 1;
//            arr[1] = 2;
//            arr[2] = 3;
//            arr[3] = 4;
//            arr[4] = 5;
//            arr[5] = 6;
//            arr[6] = 7;
//            arr[7] = 8;
//            arr[8] = 9;
//            arr[9] = 10;
//            arr[9] = 11;

           // System.out.println(arr); // dont try this

            //System.out.println(arr[0]);
            System.out.println("The length of the array is: "+arr.length);

    }
}
