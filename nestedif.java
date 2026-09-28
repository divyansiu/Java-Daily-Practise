import java.util.Scanner;

public class nestedif{
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter your age : ");
        int age = in.nextInt();
        System.out.print("Enter your Marks : ");
        double marks = in.nextDouble();
        if(age >= 18){
            if(marks >= 60){
                System.out.println("Eligible");
            }else{
                System.out.println("Age okay, but Marks too low");
            }
        }else{
            System.out.println("Underage");
        }
    }
}