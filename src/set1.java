import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> n=new LinkedHashSet<>();
        n.add(30);
        n.add(1);
        n.add(14);
        n.add(2);
        System.out.println(n);
        n.remove(30);
        System.out.println(n);
        //System.out.println(n.contains(14));
        //n.iterator();
        //System.out.println(n);
        //n.clear();
        //System.out.println(n);
        //System.out.println(n.isEmpty());
    }
}
