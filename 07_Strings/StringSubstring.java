import java.util.Scanner;

public class StringSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("String : ");
        String x = in.nextLine();
        System.out.print("Starting index : ");
        int st = in.nextInt();
        System.out.print("Ending index : ");
        int end = in.nextInt();
        
        System.out.println("Output : "+x.substring(st,end));
        in.close();
    }
}