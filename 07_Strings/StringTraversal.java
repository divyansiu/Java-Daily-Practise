import java.util.Scanner;

/**
 * StringTraversal
 */
public class StringTraversal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String n = in.nextLine();
        for(int i = 0 ; i < n.length() ; i++){
            System.out.println(n.charAt(i));
        }
        in.close();
    }
}