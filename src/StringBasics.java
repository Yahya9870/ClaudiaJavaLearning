import java.util.Scanner;

public class StringBasics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter a string: ");
        String str = sc.nextLine();
         int charCount=0;

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i)!=' ') && (str.charAt(i)!='.') && (str.charAt(i)!=',') && (str.charAt(i)!='!')) {
                charCount++;
            }
        }
        System.out.println("The actual length of the string is: "+str.length());
        System.out.println("charCount="+charCount);


    }
}
