package tarihvesaat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateFormatterSinifi {

    public static void main(String[] args) {

        LocalDate localDate=LocalDate.now();

        String bugununTarihi;
        bugununTarihi=localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Bugünün tarihi: "+bugununTarihi);

        LocalDateTime localDateTime=LocalDateTime.now();
        String bugununTarihZaman;
        bugununTarihZaman=localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println("Bugünün tarihi zaman: "+bugununTarihZaman);

        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println("Java util date çevrilmesi: "+date);


    }

}
