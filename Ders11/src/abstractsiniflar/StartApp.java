package abstractsiniflar;

public class StartApp {

    public static void main(String[] args) {

       /* Sekiller sekiller=new Sekiller() {
            @Override
            public double alanHesapla() {
                return 0;
            }
        };

        System.out.println(sekiller.alanHesapla());

        Sekiller sekiller1=new Dikdortgen();
        System.out.println(sekiller1.alanHesapla());

        Dikdortgen dikdortgen= (Dikdortgen) new Sekiller() {
            @Override
            public double alanHesapla() {
                return 0;
            }
        };*/

       Dikdortgen dikdortgen=new Dikdortgen();
       dikdortgen.setBoy(5);
       dikdortgen.setEn(6);

       System.out.println(dikdortgen.alanHesapla());

    }
}
