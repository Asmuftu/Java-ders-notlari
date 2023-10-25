package day33_MapUpdate_EntryKullanimi;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C05_EntryIleSinifListesiYazdirma {

    public static void main(String[] args) {

        // verilen sinif ve sube bilgisi ile
        // sinif listesi numara,isim,soyisim olarakyazdiran bir method olusturun

        Map<Integer,String> ogrenciMapi = MapMethodDepo.okulMapDondur();

        String sinif = "11";
        String sube = "K";

        MapMethodDepo.sinifListesiYazdirma(ogrenciMapi,sinif,sube);
    }
}
