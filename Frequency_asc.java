import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

class Frequency_asc{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int n =in.nextInt();
        int temp1 =n,temp2= n,digits=0,digits_distinct=0,c3=0;
        

        while(temp1!=0){
            temp1/=10;   
            digits+=1;
        }

        int [] tempo = new int[digits];

        while(temp2!=0){
            int check = 0;
            int b=temp2%10;
            for(int i=0;i<c3;i++){
                if (tempo[i]==b){
                    check = 1;
                }
            }
            tempo[c3]=b;
            if (check == 0)
                digits_distinct+=1;
            temp2/=10; 
            c3++;  
        }
        int [][] arr = new int[2][digits_distinct];
        int c2=0;

        for (int i=0;i<10;i++){
            int temp = n,c1=0;
            while(temp!=0){
                int b=temp%10;
                if(b==i){
                    c1+=1;
                }
                temp/=10;
            }
            if(c1>0){
                arr[0][c2]=i;
                arr[1][c2]=c1;
                c2++;
            }
                 
        }

        for(int i=0; i<digits_distinct;i++){
            System.out.println(arr[0][i]+ " = "+ arr[1][i]);
        }

    }
}