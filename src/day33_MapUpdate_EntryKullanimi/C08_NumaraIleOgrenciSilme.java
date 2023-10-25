package day33_MapUpdate_EntryKullanimi;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C08_NumaraIleOgrenciSilme {

    public static void main(String[] args) {

        // verilen  numaradaki ogrenciyi
        //map'ten silelim

        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

        ogrenciMap.remove(101);

        System.out.println(ogrenciMap.remove(102)); // Veli-Cem-10-K-TM

        System.out.println(ogrenciMap.remove(103, "Ali-Cem-11-K-TM")); //  true

        System.out.println(ogrenciMap.remove(104, "Ali-Cem-11-K-TM")); // false

        ogrenciMap.replace(104,"Ali-Cem-11-K-TM");

        ogrenciMap.replace(104,"Ali-Cem-11-K-TM","Ali-Yan-10-S-TM");

        System.out.println(ogrenciMap.containsKey(103)); // false
        System.out.println(ogrenciMap.containsKey(107)); // true

        System.out.println(ogrenciMap.containsValue("Ali")); // false


        System.out.println(ogrenciMap);
    }
}
