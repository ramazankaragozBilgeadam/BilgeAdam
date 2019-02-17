package stringler;

public class StringMethodlari {


    public static void main(String[] args) {

        String deger="Merhaba Java";

        System.out.println(deger.toUpperCase());
        //System.out.println(deger.toLowerCase());

        deger.toLowerCase();
        System.out.println(deger);

        deger.toLowerCase();

        //deger=deger.toLowerCase();

        //deger="merhaba java";
        System.out.println(deger);

        System.out.println(deger.charAt(8));


        System.out.println(deger.indexOf("J"));
        System.out.println(deger.indexOf('a'));
        System.out.println(deger.lastIndexOf('a'));

        //verilen indis numarasından başlayıp
        // geriye kalan tüm ifadeyi getirir
        //Verilen indis numarası da dahil!!!!!!!
        System.out.println(deger.substring(8));

        //5. indis'ten başla 7.elamanı al.
        System.out.println(deger.substring(5,7));
        System.out.println(deger.concat(" Naber"));
        System.out.println(deger+" Naber");
        System.out.println(deger.replace('a','o'));
        System.out.println(deger.replaceAll(" ",""));
        System.out.println(deger.replaceAll(""," "));

        String bosluk=" Merhaba ";
        System.out.println(bosluk);
        System.out.println(bosluk.trim());


        String adSoyad="Ramazan Karagoz";
        String ad="";
        String soyad="";

        int boslukDeger=adSoyad.indexOf(" ");

        System.out.println("bosluk deger: "+boslukDeger);
        ad=adSoyad.substring(0,boslukDeger);
        soyad=adSoyad.substring(boslukDeger+1);

        System.out.println("Ad: "+ad);
        System.out.println("Soyad: "+soyad);

      /*  System.out.println("char arrayy kullanımı: ");
        char[] dizi=deger.toCharArray();

        for (char c:dizi) {
            System.out.println(c);
        }*/


        String a="12";

        //ilkel tipe dönüştürmek için parseInt() methodu kullanılır.
        int sayi=Integer.parseInt(a);
        System.out.println(sayi);
        //(Wrapper)Nesne tipe dönüştürmek için valueOf methodu kullanılır.
        Integer sayi2=Integer.valueOf(a);

        //primitive tipleri String veri tipine dönüştürmek valueOf kullanılır.
        String stringSayi=String.valueOf(sayi);
        String stringSayi2=sayi2.toString();
        //(Wrapper)Nesne tipindeki bir değeri string çevirmek için
        //Valueof kullanılabilinir.
        //Strig.valueOf methodu Object turunden nesne aldığı için.
        //Java da tüm nesneler Object sınıfından türer.
        String asa=String.valueOf(sayi2);

        double doubleSayi=Double.parseDouble(a);
        System.out.println(doubleSayi);







    }
}
