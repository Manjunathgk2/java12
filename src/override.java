class a1
{
    public void mobile(String name,String rom,String ram,String processor,String color){
        System.out.println(name+" "+rom+" "+ram+" "+processor+" "+color);
    }
    public void laptop(String name,String ram){
        System.out.println(name+" "+ram);
    }
}
class b1 extends a1
{
    public void mobile(String name,String rom,String ram){
        System.out.println(name+""+rom+""+ram);
    }
}

public class override {
    public static void main(String[] args) {
        b1 obj=new b1();
        obj.mobile("vivo","128","8gb","Snapdragon","black");
        obj.laptop("samsung","16gb");
    }
}
