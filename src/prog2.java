class java2 implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Java developers");
            try { Thread.sleep(2000);} catch (Exception e) {System.out.println(e);}
        }
    }
}
class react implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("React developers");
            try {Thread.sleep(5000);} catch (Exception e) {System.out.println(e);}
        }
    }
}
public class prog2 {
    public static void main(String[] args) {
     java2 obj1=new java2();
     react obj2=new react();

     Thread t1=new Thread(obj1);
     Thread t2=new Thread(obj2);

     t1.start();
     t2.start();
    }
}
