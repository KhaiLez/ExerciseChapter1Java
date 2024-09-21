import java.util.Scanner;
public class doityourself2
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        String n;
        System.out.print("Please enter a string: ");
        n = k.nextLine();

        int characterCount =n.length();

        System.out.println("The number of characters in the given string is: " + characterCount);
    }
}
