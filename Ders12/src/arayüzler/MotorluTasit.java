package arayüzler;

public interface MotorluTasit {

    static final int tekerlekSayisi=4;
    static double gucu=120.0;
    static boolean motorDurumu=true;

    public void calistir();

    static void tanim(){
        System.out.println("Ben bir motorlu taşıtım.");
    }
}
