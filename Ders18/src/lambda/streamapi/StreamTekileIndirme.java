package lambda.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTekileIndirme {

    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(7);
        sayilar.add(7);
        sayilar.add(5);
        sayilar.add(5);
        sayilar.add(4);

        List<Integer> sayilarinKaresi=null;
        sayilarinKaresi=sayilar.stream().distinct().map(sayi->sayi*sayi)
                .collect(Collectors.toList());


        System.out.println("Karesi alınan sayilar tersten yazdırılıyor.");
        sayilarinKaresi.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("Karesi alınan sayilar belirli kurala göre sıralanıyor.");
        sayilarinKaresi.stream().sorted(Comparator.comparing(x->x%2==1)).forEach(System.out::println);
    }


}
