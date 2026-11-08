import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String x = in.nextLine();
        boolean flag = true ;
        int j = 0 ;
        for(int i = 0 ; i < x.length()/2 ; i++){
            if(Character.toUpperCase(x.charAt(i))==Character.toUpperCase(x.charAt((x.length()-1)-j))){
                flag = true ;
            }else{
                flag = false ;
                break;
            }
            j++;
        }
        if(flag){
            System.out.println("Given String is Plaindrome.");
        }else{
            System.out.println("Given String is not Palindrome.");
        }in.close();
    }
}