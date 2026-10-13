import java.util.Scanner;

/**
 * ArrayLinearSearch
 */
public class ArrayLinearSearch {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the Number of integer you want in an Array : ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("Enter the value in Array : ");
            arr[i]=in.nextInt();
        }

        System.out.print("Enter a Number to Search in the Array : ");
        int target = in.nextInt();
        boolean found = false ;
        int x=-1 ;
        for(int i = 0 ; i < n ; i ++){
            if(arr[i]==target){
                found = true ;
                x=i;
                break;
            }
        }
        if(found){
            System.out.printf("Target Found and the Target is in Index %d Or in Place %d.",x,x+1);
        }else{
            System.out.println("Target Not Found");
        }
    }
}