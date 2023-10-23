package day31_collections;

import java.util.HashSet;
import java.util.Set;

public class C02_Set {

    public static void main(String[] args) {

        Set<String> harfler = new HashSet<>();

        System.out.println(harfler.hashCode()); // 0

        harfler.add("B");
        harfler.add("Ahmed");

        System.out.println(harfler.hashCode()); // 63235175
    }
}
