import java.util.Scanner;

public class MethodLargestEvenPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Integer you want in an Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the number : ");
            arr[i] = in.nextInt();
        }
        int result = largestEvenPalindrome(arr);

        if (result == -1) {
            System.out.println("No palindrome found");
        } else {
            System.out.println("Largest even palindrome: " + result);
        }
        
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
    
    static int largestEvenPalindrome(int[] arr){ 
        boolean exist = false ;
        int largest = 0 ;
        for(int i = 0 ; i<arr.length ; i++){
            if(isPalindrome(arr[i]) && isEven(arr[i])){
                if(arr[i]>=largest){
                    largest=arr[i];
                }
                exist = true ;
            }
        }
        if(exist){
            return largest ;
        }else{
            return -1;
        }
    }

    static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
}