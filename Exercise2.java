import java.util.*;

public class Exercise2
{
    public static void main(String[] args)
    {
        byte ASCIIcode;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input an ASCII code: ");
        ASCIIcode=keyboard.nextByte();
        System.out.println("ASCIIcode "+ ASCIIcode + " is "+ (char)ASCIIcode);
    }
}






