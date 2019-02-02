package mantiksaloperatorler;

public class MantiksalOperatorApp {

    public static void main(String[] args) {
        /*
        *<var1> && <var2> ve operatörü
        *sağındaki ve solundaki değişken değeri true ise true değerini verir.
        */

        /**
         * <var1> || <var2> yada operatörü
         * sağındaki ve solundaki değerler false ise false değerini verir.
         * sağındaki ve solundaki değerlerden birisi true diğeri false ise true değerini verir.
         */

        /**
         * !<var1> değil mi operatörü
         * verilen değişkenin tersini bize verir.
         * verilen değişken true ise false değerini verir.
         * verilen değişken false ise true değerini verir.
         */

        /**
         * <var1> ^ <var2> xor işareti yada işleminin tersi
         * sağındaki ve solundaki değerler true ise bize false değerini verir.
         */

        boolean x=true, y=false, z=true, t=false,sonuc;

        sonuc=x&&z;
        System.out.println("x ve z ve(&&) ile karşılaştırılması: "+sonuc);
        sonuc=x&&y;
        System.out.println("x ve y ve(&&) ile karşılaştırılması: "+sonuc);

        sonuc=y||t;
        System.out.println("y ve t yada(||) ile karşılaştırılması: "+sonuc);
        sonuc=x||y;
        System.out.println("x ve y yada(||) ile karşılaştırılması: "+sonuc);

        sonuc=!x;
        System.out.println("x değişkeninin tersini alma: "+sonuc);
        sonuc=!y;
        System.out.println("y değişkeninin tersini alma: "+sonuc);

        sonuc=x^z;
        System.out.println("x ve z yada operatörünün tersi (^) ile karşılaştırılması: "+sonuc);
        sonuc=x^y;
        System.out.println("x ve y yada operatörünün tersi (^) ile karşılaştırılması: "+sonuc);







    }
}
