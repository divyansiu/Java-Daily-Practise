import java.util.Scanner;

public class StringCaseComparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st String : ");
        String a = in.nextLine();
        System.out.print("Enter 2nd String : ");
        String b = in.nextLine();
        if(a.equalsIgnoreCase(b)){
            System.out.println("Strings are equals.");
        }else{
            System.out.println("Strings are not equal.");
        }
        in.close();
    }
}