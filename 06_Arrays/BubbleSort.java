import java.util.Scanner;
/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        boolean swapped = false;
        for(int i = 0 ; i <arr.length ; i++){
            swapped = false;
            int x = 0, temp = 0;
            while(x<arr.length-(i+1)){
            int bubble = arr[x];
                if(bubble > arr[x+1]){
                    temp = arr[x];
                    arr[x] = arr[x+1];
                    arr[x+1]=temp;
                    swapped = true ;
                }
                x++;
            }
            if(!swapped){
                break;
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }in.close();
    }
}