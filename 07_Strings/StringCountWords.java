import java.util.Scanner;

public class StringCountWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
        String x = in.nextLine();
        int word = 1 ;
        for(int i = 0 ; i < x.length()-1 ; i++){
            if(x.charAt(i)==' ' && !(x.charAt(i+1)==' ')){
                word++;
            }
        }
        System.out.println("Total words in the given Sentence is "+word+".");
        in.close();
    }
}