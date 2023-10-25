package day33_MapUpdate_EntryKullanimi;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C07_EntryIleSoyisimUpdate {

    public static void main(String[] args) {

        // okulMap'deki tum soyisimleri buyuk harf yapan bir method olusturun

        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

        ogrenciMap = MapMethodDepo.soyisimleriBuyukharfYap(ogrenciMap);

        System.out.println(ogrenciMap);
        //{
        // 101=Ali-CAN-11-H-MF,
        // 102=Veli-CEM-10-K-TM,
        // 103=Ali-CEM-11-K-TM,
        // 104=Ayse-CAN-10-H-MF,
        // 105=Sevgi-CEM-11-M-TM,
        // 106=Sevgi-CAN-10-K-MF,
        // 107=Esra-HAN-11-M-SOZ,
        // 108=Azim-KAN-12-L-SOZ,
        // 109=Huseyin-FAN-12-H-MF,
        // 110=Azim-KAYİSİ-11-K-TM
        // }
    }
}
