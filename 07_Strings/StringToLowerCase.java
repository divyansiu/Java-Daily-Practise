import java.util.Scanner;

public class StringToLowerCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String x = in.nextLine();
        System.out.println(x.toLowerCase());
        in.close();
    }
}