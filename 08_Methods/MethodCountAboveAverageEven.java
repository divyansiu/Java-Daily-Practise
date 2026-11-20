import java.util.Scanner;

public class MethodCountAboveAverageEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Integer you want in an Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the number : ");
            arr[i] = in.nextInt();
        }
        System.out.println("No. of elements which are both even and greater than the array's average are : "+countAboveAverageEven(arr));
    in.close();
    }

    static double calculateAverage(int [] arr){
        int sum = 0 ; 
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        double average = (double) sum / arr.length ;
        return average;
    }

    static boolean iseven(int n){
        if(n%2==0)
            return true;
        else
            return false;
    }

    static int countAboveAverageEven(int[] arr){
        int count = 0 ;
        double average = calculateAverage(arr);
        for(int i = 0 ; i<arr.length ; i++){
            if(iseven(arr[i]) && (arr[i]>average)){
                count++;
            }
        }
        return count;
    }
}