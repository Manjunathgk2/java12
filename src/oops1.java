class Dog
{
    String name="Munna";
    int age=2;
   String color="White";
}
class Cat
{
    String name="abc";
    String color="black";
}
public class oops1 {
    public static void main(String[] args) {
        Dog obj=new Dog();
        Cat obj2=new Cat();
        //Dog obj1=new Dog();
        System.out.println("name is : "+obj.name+" "+"Age is : "+obj.age+" "+"Color is : "+obj.color);
        System.out.println(obj2.name+" "+obj2.color);
    }
}
