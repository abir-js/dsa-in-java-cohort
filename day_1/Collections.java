// package day_1;
import java.util.*;

public class Collections {
    public static void main(String[] args) {
        
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(2, 50);

        a.remove(2);

        for(int i = 0; i< a.size(); i++) {
            System.out.print(a.get(i) + ", ");
        }
    }
}

