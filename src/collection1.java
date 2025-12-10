import java.util.*;
public class collection1 {
    public static void main(String[] args) {
        LinkedList<String> cars=new LinkedList<>();
        cars.add("Nexon");
        cars.add(1,"Safari");
        cars.addFirst("Benz");
        cars.addLast("BMW");
        System.out.println(cars);
        cars.indexOf("Benz");
        System.out.println(cars);
        System.out.println(cars.peek());
        System.out.println(cars);
        System.out.println(cars.poll());
        System.out.println(cars);
        cars.offer("creta");
        System.out.println(cars);

    }
}
