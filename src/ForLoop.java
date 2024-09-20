public class ForLoop {
    public static void main(String[] args) {
        // The format/syntax of for loop
        // for(declare and initialise of index;condition checker; increment/decrement){
        // body of the loop
        //
        // }

        // Actual for-loop

        // Note suppose you have to run the loop N times then 2 methods:
        // 1. if i=1, range of i would be 1 to N (both included)
        // 2. if i=0  range og i would be 0 to N-1
        // Write a java program to print hello world 5 times

        // First iteration i=0, true hello world i=1
        // 2nd iteration i=1, true, hello world, i=2
        // 3rd iteration i=2, true, hello world, i=3
        // 4th iteration i=3, true, hello world, i=4
        // 5th iteration i=4, true, hello world, i=5
        // 6th iteration i=5, false and our loop finally terminates

//        for(int i = 1; i <= 5;i++) {  // i = 0,1,2,3,4
//
//            System.out.println("Hello World!");

//        }

        // 1st iteration i=1, true hello world, i=2
        // 2nd iteration i=2, true hello world, i=3
        // 3rd iteration i=3, true hello world, i=4
        // 4th iteration i=4, true hello world, i=5
        // 5th iteration i=5, true hello world, i=6
        // 6th iteration i=6, false (loop terminates)

        for (int i=0; i<5; i++) {
            System.out.println("Hello Java!");
        }


    }
}
