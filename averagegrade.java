import java.util.Scanner;

public class averagegrade{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Marks of 1st subject : ");
        double sub1 = in.nextDouble();
        System.out.print("Enter Marks of 2nd subject : ");
        double sub2 = in.nextDouble();
        System.out.print("Enter Marks of 3rd subject : ");
        double sub3 = in.nextDouble();
        double avg = (sub1 + sub2 + sub3)/3;
        System.out.printf("Average : %.2f%n",avg);
        if (avg >= 90){
            System.out.println("Grade : A");
        }else if(avg >=75){
            System.out.println("Grade : B");
        }else if(avg >=60){
            System.out.println("Grade : C");
        }else if(avg >=40){
            System.out.println("Grade : D");
        }else{
            System.out.println("Grade : F");
        }
    }
}