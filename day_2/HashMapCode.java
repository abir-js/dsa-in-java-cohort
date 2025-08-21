package day_2;

import java.util.*;

public class HashMapCode {
    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();

        student.put(1, "Abir");
        student.put(2, "Gopal");
        student.put(3, "Nagaraj");
        student.put(4, "Rajak");
        student.put(4, "Projit");
        student.put(5, "Gopal");

        // * If you put 2 same keys then previous element gets override

        if (!student.containsKey(5)) {
            student.put(5, "Ram");
        }
        student.putIfAbsent(5, "Soumya");

        System.out.println(student);

        // * Access only keys from map
        for (Integer rollNo : student.keySet()) {
            System.out.println(rollNo);
        }

        //* Access only values
        for (String name : student.values()) {
            System.out.println(name);
        }

        //* */ Access keys and values
        for(Map.Entry<Integer, String> me: student.entrySet()) {
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }
    }
}
