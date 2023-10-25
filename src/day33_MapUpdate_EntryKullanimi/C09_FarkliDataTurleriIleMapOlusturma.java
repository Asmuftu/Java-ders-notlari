package day33_MapUpdate_EntryKullanimi;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class C09_FarkliDataTurleriIleMapOlusturma {

    public static void main(String[] args) {

        /*
                 {
           id: 101,
           title: 'foo',
           body: 'bar',
           userId: 1,
           isActive: true,
           initial: A.
                 }
         */

        Map<String,Object> ornekMap = new HashMap<>();
        ornekMap.put("id",101);
        ornekMap.put("title","foo");
        ornekMap.put("body","bar");
        ornekMap.put("userId",1);
        ornekMap.put("isActive",true);
        ornekMap.put("initial",'A');

        System.out.println(ornekMap);
        // {initial=A, id=101, title=foo, body=bar, isActive=true, userId=1}


        // body key'inin value'sunu buyuk harf olarak yazdirin

        System.out.println(((String) (ornekMap.get("body"))).toUpperCase());

        // id'yi 1 artir

        Integer idDeger = (Integer)ornekMap.get("id"); // 101

        ornekMap.put("id",idDeger+1);
        System.out.println(ornekMap);

        // initial key'ine ait value bir buyuk harf mi ?

        System.out.println(Character.isUpperCase((char) (ornekMap.get("initial"))));


    }
}
