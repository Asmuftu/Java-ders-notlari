package day34_NestedMaps;

import day32_maps.MapMethodDepo;

import java.util.HashMap;
import java.util.Map;

public class C03_FarkliDataTurleriIleMapOlusturma {

    public static void main(String[] args) {
        /*
        eger value olarak farkli data turlerinden degerler girilecekse
        Map olusturulurken Map<? , Object> secilebilir

        Eger value data turu olarak Object secilirse
        value'lara erismek istedigimizde
        casting yapmamiz gerekebilir
         */

        /*
            {
            “firstname” : “Ahmet”,
            “lastname” : “Bulut”,
            “totalprice” : 500,
            “depositpaid” : false,
            “bookingdates” : {
                   “checkin” : “2023-07-21”,
                   “checkout” : “2023-08-10”
                      },
            “additionalneeds” : “wi-fi”
            }
         */

        Map<String,Object> bookingMap =
                MapMethodDepo.rezervasyonOlustur("Ahmed","Muftu",999,true,"2023-10-30","2023-11-10","wi-fi");

        System.out.println(bookingMap);

        /*
        {
        firstname=Ahmed,
        additionalneeds=wi-fi,
        bookingdates={
                      checkin=2023-10-30,
                      checkout=2023-11-10
                      },
        totalprice=999,
        depositpaid=true,
        lastname=Muftu}
         */

        // firstname'i yazdirin

        System.out.println(bookingMap.get("firstname")); // Ahmed

        // depositpaid yazdirin

        System.out.println(bookingMap.get("depositpaid")); // true

        // checkin yazdirin

        System.out.println(((Map) bookingMap.get("bookingdates")).get("checkin")); // 2023-10-30

        System.out.println(((Map<?, ?>) bookingMap.get("bookingdates")).get("checkout")); // 2023-11-10

        // totalprice'i 300 olarak update edin
        bookingMap.put("totalprice",300);

        // checkin degerini 2023-10-25 olarak update edelim

        ((Map<String, String>) bookingMap.get("bookingdates")).put("checkin","2023-10-25");

        System.out.println(bookingMap);
    }
}
