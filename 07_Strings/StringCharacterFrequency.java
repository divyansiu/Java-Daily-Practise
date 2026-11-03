import java.util.Scanner;

public class StringCharacterFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enetr a String : ");
        String x = in.nextLine();
        System.out.print("Enetr a Character : ");
        char y = in.next().charAt(0);
        int count = 0 ;
        for(int i = 0 ; i < x.length() ; i++){
            if(x.charAt(i) == y){
                count++;
            }
        }

        System.out.printf("'%c' appeared in '%s' %d times.",y,x,count);
        in.close();
    }
}