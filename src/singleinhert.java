class ajay  // parent
{
    public void demo1()
    {
        System.out.println("Hello parent");
    }
}
class B extends ajay  // child class
{
    public void demo2()
    {
        System.out.println("Hello child and parent");
    }
}

public class singleinhert {
    public static void main(String[] args) {
        B obj=new B();
        obj.demo1();
        obj.demo2();
    }
}
