import java.util.Scanner;
public class Check
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first text please:");
        String text1= sc.nextLine();
        System.out.println("Enter the second text please:");
        String text2= sc.nextLine();

        System.out.println((text1.contentEquals(text2))?"Yes both are equal":"No they are not equal");
        sc.close();
    }
}
