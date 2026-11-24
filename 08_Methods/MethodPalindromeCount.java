import java.util.Scanner;

public class MethodPalindromeCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Integer you want in an Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the number : ");
            arr[i] = in.nextInt();
        }
        System.out.println("Number of Palindrome in array : "+countPalindrome(arr));
        
    in.close();
    }

    static boolean isPalindrome(int n){
        boolean palindrome = false;
        int original = n, reverse=0;
        while(n>0){
            reverse = reverse*10 + (n%10);
            n/=10;
        }
        if(original==reverse){
            palindrome = true ;
        } 
        return palindrome ;
    }

    static int countPalindrome(int[] arr){
        int count = 0, x = 0 ;
        while(x<arr.length){
            if(isPalindrome(arr[x])){
                count++;
            }
            x++;
        }
        return count ;
    }
}