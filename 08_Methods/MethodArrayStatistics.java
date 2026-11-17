import java.util.Scanner;

public class MethodArrayStatistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Integer you want in an Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the number : ");
            arr[i] = in.nextInt();
        }
        int sum = sumArray(arr), largest = largestarr(arr), smallest = smallestarr(arr);
        System.out.println("Sum : "+sum);
        System.out.println("Largest Element : "+largest);
        System.out.println("Smallest Element : "+smallest);
        

        
    in.close();
    }

    static int sumArray(int arr[]){
        int sum = 0 ;
        int x = arr.length-1;
        while(x>=0){
            sum += arr[x];
            x--;
        }
        return sum;
    }

    static int largestarr(int arr[]){
        int largest = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest ;
    }

    static int smallestarr(int[] arr){
        int smallest = arr[0];
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest; 
    }
}