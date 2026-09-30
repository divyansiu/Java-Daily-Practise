import java.util.Scanner;
public class allfactor {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in) ;
        System.out.print("Enter a number to find its Factor : ");
        int num = in.nextInt();
        for(int i=1; i<=num ; i++){
            if(num%i==0){
                System.out.println(i);
            } 
        }

    }
}
