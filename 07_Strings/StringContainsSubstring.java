import java.util.Scanner;

public class StringContainsSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String x = in.nextLine();
        System.out.print("Enter a word : ");
        String y = in.next();
        if(x.contains(y)){
            System.out.printf("Word '%s' Found in the Sentence '%s'.",y,x);
        }else{
            System.out.printf("Word '%s' is not Present in the Sentence '%s'.",y,x);
        }
        in.close();
    }
}