

public class MethodSecondLargest {

    static int largestarr(int arr[]){
        int x = arr[0];
        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i]>=x){
                x=arr[i];
            }
        }
        return x;
    }

    static int secondlargestarr(int arr[]){
        int x=arr[0], y=Integer.MIN_VALUE;
        boolean exist = false ;
        for(int i = 1 ; i<arr.length ; i++){
            if(x!=arr[i]){
                if(arr[i]>x){
                    y=x;
                    x=arr[i];
                    exist = true;
                }
                if(arr[i]>=y && arr[i]<x){
                    y=arr[i];
                    exist = true;
                }
            }
        }
        if (exist) {
            return y;
        }else{
            System.out.println("No Second Largest Distinct value.");
            return Integer.MIN_VALUE;
        }
    }
    public static void main(String[] args) {
    int[] arr = {12, 5, 34,54,65,75,34,33,55,77,55,23,12,10,7,8,8, 12, 9, 10};
    System.out.println("Largest value in Array : "+largestarr(arr));
    System.out.println("Second Largest Value in Array : "+secondlargestarr(arr));
    }
}