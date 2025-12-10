import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and colms");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] array=new int[r][c];
        System.out.println("enter the array elemets");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                array[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}
