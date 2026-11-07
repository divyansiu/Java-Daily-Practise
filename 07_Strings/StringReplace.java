import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
        String x = in.nextLine();
        System.out.print("Enter Word for search : ");
        String sh = in.next();
        System.out.print("Enter word for replace : ");
        String rp = in.next();
        if(x.contains(sh)){
            System.out.print("Output : "+x.replace(sh,rp));
        }else{
            System.out.println("No Matching word Found.");
        }
        
        in.close();
    }
}