import java.util.Scanner;

public class StringIndexOf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String x = in.next();
        System.out.print("Enter a Character : ");
        char y = in.next().charAt(0);
        int index = x.indexOf(y);
        if(index != -1){
                System.out.printf("'%s' Conatins '%c' at index : %d.",x,y,x.indexOf(y));
            }else{
                System.out.printf("'%s' is not present in the word '%s'.",y,x);
            }
        in.close();
    }
}