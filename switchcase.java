import java.util.Scanner;

public class switchcase{
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter 1st number : ");
        double num1 = in.nextDouble();
        System.out.print("Enter 2nd number : ");
        double num2 = in.nextDouble();
        System.out.print("Select operations (+,*,/,-) : ");
        char operation = in.next().charAt(0);
        switch(operation){
            case '+' : 
                System.out.println("Result = "+(num1+num2));
            break;

            case '*' :
                System.out.println("Result = "+(num1*num2));
            break;

            case '/' :
                if(num2==0){
                    System.out.println("Division by 0 is not possible.");
                }else{
                    System.out.println("Result = "+(num1/num2));
                }
            break;

            case '-' :
                System.out.println("Result = "+(num1-num2));
            break;

            default :
                System.out.println("Invalid operator !!");
        }
    }
}