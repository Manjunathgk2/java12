class java1
{
    public int area(int s)   //area of square
    {
        return s*s;
    }
    public int area(int l,int b)  //area of rectangle
    {
        return l*b;
    }
    public double area(double r) //area of circle
    {
        return 3.14*r*r;
    }
}

public class overloading {
    public static void main(String[] args) {
     java1 obj=new java1();
     System.out.println("area of square: "+obj.area(5));
     System.out.println("area of rectangle: "+obj.area(5,3));
     System.out.println("area of circle: "+obj.area(5.1));
    }
}
