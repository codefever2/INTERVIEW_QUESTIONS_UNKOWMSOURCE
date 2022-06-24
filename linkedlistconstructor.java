import java.util.*;
import java.util.LinkedList;

public class linkedlistconstructor
{
    public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    List<Integer> l = new LinkedList<>(al);
        System.out.println(l);
        al.set(0,7);
        al.add(5);
        System.out.println("***");
        System.out.println(l);
        l.set(0,10);
        System.out.println(al);
        ArrayList<Integer> al1 = new ArrayList<>(al);
        System.out.println(al1);
        al.add(18);
        System.out.println(al1);
}
}
