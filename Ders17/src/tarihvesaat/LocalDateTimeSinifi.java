package tarihvesaat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeSinifi {


    public static void main(String[] args) {


        LocalDateTime localDateTime=LocalDateTime.now();

        System.out.println("Şimdiki zaman ve tarih: "+localDateTime);
        LocalDateTime belirliTarihZaman=LocalDateTime.of(2019,04,15,5,30,15);
        System.out.println("Belirli zaman tarih: "+belirliTarihZaman);

        LocalTime belirliSaniyeZaman=LocalTime.ofSecondOfDay(5000);
        LocalDateTime belirliTarih=LocalDateTime.of(LocalDate.now(), belirliSaniyeZaman);
        System.out.println("Belirli tarih time ve date'e göre: "+belirliTarih);


    }


}
