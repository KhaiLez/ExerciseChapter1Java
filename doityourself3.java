import java.util.*;
public class doityourself3
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        System.out.print("Enter a value number of width rectangle: ");
        double a=k.nextDouble();
        System.out.print("Enter a value number of high rectangle: ");
        double h=k.nextDouble();
        double Area= a*h;
        double Perimeter= (a+h)*2;
        System.out.println("Value of Area= "+ Area);
        System.out.println("Value of Perimeter= "+ Perimeter);

    }
}
