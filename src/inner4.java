abstract class demo32
{
   abstract void add(int a,int b);
}
public class inner4 {
    public static void main(String[] args) {
        demo32 obj=new demo32()
        {
            @Override
            void add(int a, int b)
            {
                System.out.println(a+b);
            }
        };
        obj.add(4,1);
    }
}
