package day36_GenelTekrar;

public class C06_StringdekiSayilariBulma {

    public static void main(String[] args) {

        // verilen bir metindeki rakamlarin toplamini yazdiran bir method olusturun
        // ornek : Istanbul1453.
        // output : 13
        rkmlrtplm("Istanbul1453.");
    }

    public static void rkmlrtplm(String input){

        // 1. yol
        int toplam = 0;
        char karakter;

        for (int i = 0; i < input.length(); i++) {

            karakter = input.charAt(i);

            if (Character.isDigit(karakter)){
                toplam += Character.getNumericValue(karakter);
            }
        }
        System.out.println("Metindeki sayilarin toplami : "+toplam );
    }
}
