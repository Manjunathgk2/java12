import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class prique {
    public static void main(String[] args) {
        ArrayDeque<Integer> name=new ArrayDeque<>();
        name.offer(3);
        name.offer(1);
        name.offer(8);
        name.offer(2);
        System.out.println(name);
        System.out.println(name.poll());
        System.out.println(name);
        System.out.println(name.peek());
        name.push(10);
        System.out.println(name);
        name.pop();
        System.out.println(name);
         name.addFirst(20);
        System.out.println(name);
         name.addLast(30);
        System.out.println(name);
       System.out.println(name.size());
       name.add(40);
       System.out.println(name);




    }
}
