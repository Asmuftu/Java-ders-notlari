package day36_GenelTekrar;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class C07_OrtalamaUstundekiOgrenciSayisi {

    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner scanner = new Scanner(System.in);
        List<Double> notlarListesi = new ArrayList<>();
        double notToplami = 0;
        double ortalamaNot;
        int ortalamaUstundekiOgrenciSayisi = 0;
        double not;
        boolean devamEdeyimMi = true;

        do {
            System.out.println("Lutfen ogrenci notu giriniz,\n bitirmek icin Q'ya basiniz");
            try {
                not = scanner.nextDouble();
                if (not<0 || not >100){
                    throw new IllegalArgumentException();
                }
                notlarListesi.add(not);
                notToplami += not;
            }catch (InputMismatchException e){
                String hocaMetin = scanner.nextLine();
                if (hocaMetin.equalsIgnoreCase("q")){
                    devamEdeyimMi = false;
                }else {
                    System.out.println("Not girisi yanlis, lutfen sayi giriniz");
                }
            }catch (IllegalArgumentException e){
                System.out.println("Yemezler canim :) ");
            }
        }while (devamEdeyimMi);

        ortalamaNot = notToplami/ notlarListesi.size();

        for (double each:notlarListesi) {
           if (each >= ortalamaNot){
               ortalamaUstundekiOgrenciSayisi++;
           }
        }
        System.out.println("not girilen ogrenci sayisi :" + notlarListesi.size());
        System.out.println("not ortalamasi : " + ortalamaNot);
        System.out.println("ortalama ustundeki ogrenci sayisi : " + ortalamaUstundekiOgrenciSayisi);
    }
}
