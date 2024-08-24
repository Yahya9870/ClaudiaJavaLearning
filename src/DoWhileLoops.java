public class DoWhileLoops {
    public static void main(String[] args) {
        // In do-while loop even if given condition is false then also loop will run.
        // do-while loop will run atleast one time even if the condition is false
        int i = 100;
        do{
            System.out.println("False Condition");
            i++;
        }
        while(i<0);
    }
}
