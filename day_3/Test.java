package day_3;

import java.util.*;

@SuppressWarnings("unused")
public class Test {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;

        Employee e1 = new Employee(1, "Abir");
        Employee e2 = new Employee(1, "Abir");

        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));
    }
}
