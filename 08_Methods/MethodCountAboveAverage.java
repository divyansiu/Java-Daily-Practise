import java.util.Scanner;

public class MethodCountAboveAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Integer you want in an Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the number : ");
            arr[i] = in.nextInt();
        }
        double average = averageArray(arr) ;
        int no_of_aboveaverage = countAboveAverage(arr, average);
        System.out.println("Avverage : "+average);
        System.out.println("No of element greater than Average : "+no_of_aboveaverage);
    in.close();
    }

    static double averageArray(int[] arr){
        int sum = 0 ,x=0 ;
        while(x<arr.length){
            sum += arr[x];
            x++;
        }
        double average = (double)sum/arr.length ;
        return average ;
    }

    static int countAboveAverage(int[] arr, double average){
        int count = 0 ;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]>average){
                count++;
            }
        }
        return count ;
    }
}