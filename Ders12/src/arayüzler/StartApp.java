package arayüzler;

public class StartApp {

    public static void main(String[] args) {

        Araba araba=new Araba();
        Tasit tasit=new Araba();
        ((Araba) tasit).calistir();

        araba.calistir();
        araba.hareketEt();
        araba.hareketsizKal();
        MotorluTasit.tanim();
        //MotorsuzTasit.tekerlekSayisi=5;
        System.out.println("Tekerlek sayisi: "+MotorluTasit.tekerlekSayisi);
        System.out.println("Motor durumu: "+MotorluTasit.motorDurumu);
        System.out.println("Motor gücü: "+MotorluTasit.gucu);

        Bisiklet bisiklet=new Bisiklet();
        System.out.println();
        bisiklet.hareketEt();
        bisiklet.sur();
        bisiklet.hareketsizKal();
        System.out.println("Tekerlek sayisi: "+MotorsuzTasit.tekerlekSayisi);
        System.out.println("Motor durumu: "+MotorsuzTasit.motorDurumu);
        System.out.println("Motor gücü: "+MotorsuzTasit.gucu);

    }
}
