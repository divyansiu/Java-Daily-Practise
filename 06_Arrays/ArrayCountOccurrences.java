
import java.util.Scanner;

/**
 * ArrayCountOccurrences
 */
public class ArrayCountOccurrences {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array length : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter Value in Array : ");
            arr[i] = in.nextInt();
        }
        int target, count=0 ;
        System.out.print("Enter a Target to Count : ");
        target = in.nextInt();

        for (int i = 0 ; i < n ; i++){
            if(arr[i]==target){
                count++;
            }
        }
        if(count!=0){
            System.out.printf("Given target is Repeated %d times in Array.",count);
        }else{
            System.out.println("Given Target is not Found in the Array.");
        }in.close();
    }
}