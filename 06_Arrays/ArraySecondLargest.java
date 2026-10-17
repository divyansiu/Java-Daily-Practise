// import java.util.Scanner;

// /**
//  * ArraySecondLargest
//  */
// public class ArraySecondLargest {
//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enetr Lenght of Array : ");
//         int n = in.nextInt();
//         int [] arr = new int[n];
//         for(int i = 0 ; i < n ; i++){
//             System.out.print("Enter Value in Array : ");
//             arr[i]=in.nextInt();
//         }
//         int max = arr[0], second_max = arr[1];
//         for(int i = 1 ; i < n ; i++){
//             if(arr[i] > max){
//                 second_max = max;
//                 max = arr[i];
//             }else{
                
//             }
//         }
//     }
// }//not finished





import java.util.Scanner;

/**
 * ArraySecondLargest
 */
public class ArraySecondLargest {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            System.out.print("Enter value : ");
            arr[i] = in.nextInt();
        }
        boolean flag=false ;
        int max1=arr[0], max2=Integer.MIN_VALUE;
        for(int i = 1 ; i<n ; i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
                flag=true;
            }else if(arr[i]<max1 && arr[i]>max2){
                max2=arr[i];
                flag=true;
            }
        }
        if(!flag){
            System.out.println("No Second Largest Distinct Value present.");
        }else{
            System.out.print("Second largest distinct value is : "+max2);
        }
        in.close();       
    }
}