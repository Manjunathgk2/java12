import java.util.Scanner;

public class condt1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a val");
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("numbner is odd");
        }

    }
}
