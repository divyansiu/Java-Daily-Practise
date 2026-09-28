import java.util.*;
public class ifeligibility{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int age = in.nextInt();
        System.out.print("Enter your Marks : ");
        double marks = in.nextDouble();
        if (age >= 18 && marks >= 60){
            System.out.println("Eligible for admission.");
        }else{
            System.out.println("Not Eligible for admission.");
        }
    }
}