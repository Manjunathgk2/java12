abstract class demo
{
    String name;
   demo(String name)
   {
       this.name=name;
   }
   abstract void details();
}
class ab extends demo
{
    ab(String name)
    {
        super(name);
    }
    void details()
    {
        System.out.println(name);
    }
}
public class abstract1 {
    public static void main(String[] args) {
    ab obj=new ab("ajay");
    obj.details();
    }
}
