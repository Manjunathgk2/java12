import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number from 1 to 100");
        int marks=sc.nextInt();
        switch (marks)
        {
            case 90:
                System.out.println("A grade");
                break;
            case 80:
                System.out.println("B grade");
                break;
            case 40:
                System.out.println("Fail");
                break;
            default:
                System.out.println("Enter a valid marks");
                break;
        }
    }
}
