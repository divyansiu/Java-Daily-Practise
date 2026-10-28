import java.util.Scanner;
/**
 * ArrayMaximum
 */
public class ArrayMaximum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Integer you want in an Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the number : ");
            arr[i]=in.nextInt();
        }
        int max = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.printf("Maximum Number in Array is %d",max);in.close();
    }
}