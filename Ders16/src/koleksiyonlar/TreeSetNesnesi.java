package koleksiyonlar;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetNesnesi {

    public static void main(String[] args) {

        Set<String> harfler=new TreeSet<>();

        harfler.add("c");
        harfler.add("d");
        harfler.add("z");
        harfler.add("a");
        harfler.add("b");

        for (String harf:harfler){
            System.out.println(harf);
        }


        Set<Integer> sayilar=new TreeSet<>();
        sayilar.add(88);
        sayilar.add(2);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println("Sayilar sıralanması");
        for (Integer sayi:sayilar) {
            System.out.println(sayi);
        }

        Date date0=new Date();
        Date date1=new Date("4/12/2020");
        Date date2=new Date("5/13/2019");
        Date date3=new Date("5/13/2019");

        /*System.out.println(date0);
        System.out.println(date1);
        System.out.println(date2);*/

        System.out.println("Tarihlerin sıralanması");
        Set<Date> tarihler=new TreeSet<>();

        tarihler.add(date2);
        tarihler.add(date1);
        tarihler.add(date0);
        tarihler.add(date3);

        for (Date date:tarihler){
            System.out.println(date);
        }


    }

}
