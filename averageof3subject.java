import java.util.*;
public class averageof3subject{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you Name : ");
        String name = in.nextLine();
        System.out.print("Enter you Age : ");
        int age = in.nextInt();
        System.out.print("Enter Subject 1 Marks : ");
        int sub1 = in.nextInt();
        System.out.print("Enter Subject 2 Marks : ");
        int sub2 = in.nextInt();
        System.out.print("Enter Subject 3 Marks : ");
        int sub3 = in.nextInt();
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        int total = sub1+sub2+sub3 ;
        System.out.println("Total : "+ total);
        double avg = (sub1+sub2+sub3)/3.0;
        System.out.println("Average : "+avg);
        
    }
}