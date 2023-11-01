package day36_GenelTekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Array {

    public static void main(String[] args) {

        // verilen iki string array'deki
        // ortak elementleri bulup
        // bir array olarak donduren bir method yazin

        String[] arr1 = {"A","C","B","J","V","G","Z","L","M"};
        String[] arr2 = {"S","R","B","S","R","T","T","B","K","G","Z","L"};

        System.out.println(Arrays.toString(ortakElemanlariBul(arr1, arr2)));
    }

    public static String[] ortakElemanlariBul(String[] arr1,String[] arr2){

        List<String> ortakElementlerList = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                    if(arr1[i].equals(arr2[j]) && !ortakElementlerList.contains(arr2[j])){
                        ortakElementlerList.add(arr2[j]);
                    }
            }
        }
        String[] ortakArr = new String[ortakElementlerList.size()];
        for (int i = 0; i < ortakArr.length ; i++) {
            ortakArr[i] = ortakElementlerList.get(i);
        }



        return ortakArr;
    }
    /*
         1 ile 100.000 arasinda element sayisina sahip bir array icin
         tum degerler 1,2,3,4 ’dur.
         verilen array’in tum elementlerini birbirine esit hale getirmek icin
         sayilari 1 artirabilir veya azaltabiliriz
         bu islemler tekrarlanabilir
         Bu array’in tum elementlerini esitlemek icin
         minimum kac artirma veya azaltma yapilmasi gerektigini bulan
         bir kod yaziniz
         */

    /* sirali tek pozitif tam sayilardan olusan bir array veriliyor
       array’de eksik olan tek sayiyi bulan bir method olusturun
        input : [1,3,5,7,9,13,15,17] output : 11
        input : [9,7,3] output : 5
     */
}
