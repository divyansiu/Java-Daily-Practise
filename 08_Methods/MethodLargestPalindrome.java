import java.util.Scanner;

public class MethodLargestPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Integer you want in an Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the number : ");
            arr[i] = in.nextInt();
        }
        int result = largestPalindrome(arr);

        if (result == -1) {
            System.out.println("No palindrome found");
        } else {
            System.out.println("Largest palindrome: " + result);
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
    
    static int largestPalindrome(int[] arr){
        int[] palindrome = new int[countPalindrome(arr)]; 
        int x = 0;
        boolean exist = false ;
        for(int i = 0 ; i<arr.length ; i++){
            if(isPalindrome(arr[i])){
                palindrome[x] = arr[i]; 
                x++;
                exist = true ;
            }
        }
        if(exist){
            int largest = palindrome[0];
            for(int i = 1 ; i<palindrome.length ; i++){
                if(palindrome[i]>largest){
                    largest=palindrome[i];
                }
            }
            return largest ;
        }else{
            return -1;
        }
    }
}