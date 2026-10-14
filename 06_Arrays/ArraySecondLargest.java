import java.util.Scanner;

/**
 * ArraySecondLargest
 */
public class ArraySecondLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enetr Lenght of Array : ");
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter Value in Array : ");
            arr[i]=in.nextInt();
        }
        int max = arr[0], second_max = arr[1];
        for(int i = 1 ; i < n ; i++){
            if(arr[i] > max){
                second_max = max;
                max = arr[i];
            }else{
                
            }
        }
    }
}//not finished