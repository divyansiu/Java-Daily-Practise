import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String st = in.nextLine();
        String[] word = st.split(" ");
        for(int i = 0 ; i < word.length ; i++){
            System.out.println("String after splitting : "+word[i]);
            
        }in.close();
    }
}