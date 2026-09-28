import java.util.Scanner;

public class productclaculation{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Product Name : ");
        String p_name = in.nextLine();
        System.out.print("Enter Product Price : ");
        double p_price = in.nextDouble();
        System.out.print("Enter Quantity : ");
        int quantity = in.nextInt();
        double t_price = p_price*quantity;
        double discount = t_price*0.10;
        double f_price = t_price-discount;
        System.out.println("Product : "+p_name);
        System.out.printf("Price : %.2f%n",p_price);
        System.out.printf("Quantity : %d%n",quantity);
        System.out.printf("Subtotal : %.2f%n",t_price);
        System.out.printf("Discount : %.2f%n",discount);
        System.out.printf("Final Price : %.2f%n",f_price);
    }
}