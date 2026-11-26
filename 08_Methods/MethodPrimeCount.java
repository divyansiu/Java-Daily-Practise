import java.util.Scanner;

public class MethodPrimeCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Integer you want in an Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the number : ");
            arr[i] = in.nextInt();
        }
        System.out.println("Number of Prime no in array : "+countPrimes(arr));
        
        
    in.close();
    }

    static boolean isprime(int n){
        boolean prime = false ;
        int count = 0 ;
        for(int i = 1 ; i<=n ; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count == 2){
            prime = true;
        }
        return prime ;
    }

    static int countPrimes(int [] arr){
        int count = 0 ,x=0;
        while(x<arr.length){
            if(isprime(arr[x])){
                count++;
            }
            x++;
        }
        return count ;
    }
}