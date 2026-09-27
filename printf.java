public class printf{
    public static void main(String[] args){
        String Name = "Divyanshu" ;
        int age = 19 ;
        System.out.printf("My Name is %s and My age is %d.",Name,age);
    }
}

/* printf()

Used when you want formatted output.
%s → String
%d → integer
%f → floating-point number
%c → character
%b → boolean

You can also control decimal places:

double cgpa = 8.5678;

System.out.printf("%.2f", cgpa);

Output:

8.57

And you can put a newline into printf:

System.out.printf("Hello%n");

%n is Java's platform-independent newline.

*/