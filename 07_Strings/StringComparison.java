import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First String : ");
        String a = in.nextLine();
        System.out.print("Enter Second String : ");
        String b = in.nextLine();
        if(a.equals(b)){
            System.out.println("Strings are Equal.");
        }else{
            System.out.println("String are Not Equal.");
        }in.close();
    }
}