import java.util.Scanner;

public class eligibility{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Age : ");
        int age = in.nextInt();
        System.out.print("Enter Marks : ");
        double marks = in.nextDouble();
        System.out.println("Age : "+age);
        System.out.println("Marks : "+marks);
        System.out.println("Eligibility : "+ (age>=18 && marks>=60));
    }
}