package day31_collections;

import java.util.Set;
import java.util.TreeSet;

public class C05_ArraySorusuSetleCozum {

    public static void main(String[] args) {

        // verilen array'den tekrar eden elementleri silip
        // array'i her bir elementin unique oldugu hali ile kaydedin

        int[] arr = {2, 4, 6, 4, 1, 2, 5, 7, 9, 4, 5, 7, 2};

        Set<Integer> tekrarsizSet = new TreeSet<>();

        // set unique elementlerden olustugu icin
        // array'deki elementleri set'e eklersek
        // tekrar edenler yok olur

        for (Integer  each: arr) {
            tekrarsizSet.add(each);
        }
        System.out.println("Set : " + tekrarsizSet);

        // Set index kullanmadigi icin for-loop kullanamayiz
        // for-each loop kullanmaliyiz

        arr = new int[tekrarsizSet.size()];

        // for-each loop ile yapacagimiz icin arr'in index'ini biz takip etmeliyiz

        int index = 0;
        for (Integer each: tekrarsizSet) {
            arr[index] = each;
            index++;
        }
        System.out.println("Array'in son hali : " + tekrarsizSet);
    }
}
