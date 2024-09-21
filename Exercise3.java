import java.util.Scanner;
public class Exercise3
{
    public static void main(String[] args)
    {
        char ch;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the character: ");
        ch = keyboard.next().charAt(0);
        System.out.println("ASCII coce of "+ ch + " is "+ (byte)ch);
    }
}