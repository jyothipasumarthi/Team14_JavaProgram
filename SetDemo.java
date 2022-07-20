import java.util.*;
public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<Integer>();
        //Set<Integer> hs= new TreeSet<Integer>();
        //Set<Integer> hs= new LinkedHashSet<Integer>();
        hs.add(10);
        hs.add(10);
        hs.add(30);
        System.out.println(hs);
        Set<Integer> hs1= new LinkedHashSet<Integer>();
        hs1.add(110);
        hs1.add(210);
        hs1.add(230);
        System.out.println(hs1);
        Set<Integer> hs2= new TreeSet<Integer>();
        hs2.add(310);
        hs2.add(120);
        hs2.add(300);
        System.out.println(hs2);
    }
}
