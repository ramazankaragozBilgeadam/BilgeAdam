package koleksiyonlar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHashMapNesnesi {

    public static void main(String[] args) {

        List<String> birinciSinifList=new ArrayList<>();

        birinciSinifList.add("Ali");
        birinciSinifList.add("Veli");

        List<String> ikinciSinifList=new ArrayList<>();
        ikinciSinifList.add("Can");
        ikinciSinifList.add("Ahmet");

        ConcurrentHashMap<String,List> sinifDuzeyleri=new ConcurrentHashMap<>();

        sinifDuzeyleri.put("1.sınıf",birinciSinifList);
        sinifDuzeyleri.put("2.sınıf",ikinciSinifList);

        Set<String> sinifDuzeyKey=sinifDuzeyleri.keySet();

        System.out.println("Sinif duzeyi ilk boyutu: "+sinifDuzeyleri.size());
        for (String key:sinifDuzeyKey){
            if (key.equals("1.sınıf")){
                System.out.println("1.sınıflar siliniyor.");
                sinifDuzeyleri.remove(key);
            }
        }

        System.out.println("Sinif duzeyi son boyutu: "+sinifDuzeyleri.size());

        for (Map.Entry entry:sinifDuzeyleri.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            //sinifDuzeyleri.remove(entry.getKey());
        }

        System.out.println(sinifDuzeyleri.size());







    }
}
