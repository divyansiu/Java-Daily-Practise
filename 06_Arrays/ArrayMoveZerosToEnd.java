import java.util.Scanner;

/*
take length of an array
take value of array
runn loop of array length 
check if element = o swap to end but remaining shift left  */
/**
 * ArrayMoveZerosToEnd
 */
public class ArrayMoveZerosToEnd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of an array : ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.print("Enter value in array : ");
            arr[i] = in.nextInt();
        }

        System.out.print("Array before moving zero : ");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int j = 0 ;

        for(int i = 0 ; i <arr.length ; i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }

        while(j<arr.length){
            arr[j]=0;
            j++;
        }
        
        System.out.print("Array after moving zero : ");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }in.close();
    }
}