import java.util.*;

public class Collections {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        //* Here list is interface and ArrayList is class
        LinkedList<Integer> b = new LinkedList<>();
        //* Here we are using both LinkedList interface and class to use exclusive methods like addFirst, removeFirst.
        

        System.out.println(a.size());
        a.add(10);
        System.out.println(a.size());
        a.add(20);
        System.out.println(a.size());
        a.add(30);
        System.out.println(a.size());
        b.addFirst(50); // exclusive method of LinkedList
        // b.removeFirst(); // exclusive method of LinkedList

        // a.remove(2);

        System.out.println(a);
        // for(int i = 0; i < a.size(); i++){
        //     System.out.println(a.get(i));
        // }
        // Iterator<Integer> it = a.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

    }
}