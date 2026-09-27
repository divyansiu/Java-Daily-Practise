import java.util.Scanner ;
public class input{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = in.nextLine();
        System.out.print("Enter your Age : ");
        int age = in.nextInt();
        System.out.print("Enter your CGPA : ");
        double cgpa = in.nextDouble();
        System.out.print("Enter your Grade : ");
        char grade = in.next().charAt(0);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("CGPA : "+cgpa);
        System.out.println("Grade : "+grade);
    }
}