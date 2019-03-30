package lambda.streamapi;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMinMax {

    public static void main(String[] args) {

        List<Integer> sayilar= Arrays.asList(7,23,5,87,3,9,99);

        IntSummaryStatistics istatistik=sayilar.stream().collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("En küçük sayı: "+istatistik.getMin());
        System.out.println("En büyük sayı: "+istatistik.getMax());
        System.out.println("Sayıların ortalaması: "+istatistik.getAverage());
        System.out.println("Sayıların toplamı: "+istatistik.getSum());
        System.out.println("kaçtane sayı var: "+istatistik.getCount());


    }

}
