import java.util.Scanner;

/**
 * ArrayRemoveDuplicates
 */
public class ArrayRemoveDuplicates {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr =  {3,4,5,4,3,6,5,7,4};
        boolean flag = true;
        for(int i = 0 ; i<arr.length ; i++){
            flag=true;
            for(int j = i-1 ; j>=0 ; j--){
                if(arr[j]==arr[i]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.print(arr[i]+" ");
            }
        }in.close();
    }
}