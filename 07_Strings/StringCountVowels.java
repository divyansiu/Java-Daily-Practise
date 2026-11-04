import java.util.Scanner;

public class StringCountVowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String x = in.nextLine();
        int count = 0 ;
        for(int i=0 ; i<x.length() ; i++){
            if(x.charAt(i)=='a' || x.charAt(i)=='A' || x.charAt(i)=='e' || x.charAt(i)=='E' || x.charAt(i)=='i' || x.charAt(i)=='I' || x.charAt(i)=='o' || x.charAt(i)=='O' || x.charAt(i)=='u' || x.charAt(i)=='U' ){
                count++;
            }
        }
        System.out.printf("Number of vowels in the given Strings are %d.",count);in.close();
    }
}