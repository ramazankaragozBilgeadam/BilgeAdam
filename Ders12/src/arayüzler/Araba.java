package arayüzler;

public class Araba implements Tasit,MotorluTasit {

    @Override
    public void hareketEt() {
        System.out.println("Araba harekete geçti");
    }

    @Override
    public void hareketsizKal() {
        System.out.println("Araba hareketsiz durumda.");
    }

    @Override
    public void calistir() {
        System.out.println("Araba çalışıyor.");
    }
}
