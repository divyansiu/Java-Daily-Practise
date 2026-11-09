import java.util.Scanner;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
        String x = in.nextLine();
        System.out.print("Enter a Prefix : ");
        String prefix = in.next();
        System.out.println("Starts with Prefix : "+x.startsWith(prefix, 0));
        System.out.println("End with Prefix : "+x.endsWith(prefix));in.close();
    }
}