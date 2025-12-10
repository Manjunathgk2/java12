interface A
{
    void add(int a,int b);
}
interface C extends A
{
    void sub(int c,int d);
}
class demo0 implements C
{
  public void add(int a,int b)
  {
      System.out.println(a+b);
  }
    public void sub(int a,int b)
    {
        System.out.println(a+b);
    }
}
public class interface1 {
    public static void main(String[] args) {
        demo0 obj=new demo0();
        obj.add(6,1);
        obj.sub(8,1);
    }
}
