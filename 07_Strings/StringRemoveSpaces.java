import java.util.Scanner;

public class StringRemoveSpaces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String x = in.nextLine();
        for(int i = 0 ; i < x.length() ; i++){
            if(!(x.charAt(i) == ' ')){
                System.out.print(x.charAt(i));
            }
        }
        in.close();
    }
}