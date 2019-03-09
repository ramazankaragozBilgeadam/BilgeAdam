package arayüzler;

public interface MotorsuzTasit {

    static int tekerlekSayisi=2;
    static double gucu=20.0;
    static boolean motorDurumu=false;

    public void sur();

    static void tanim(){
        System.out.println("Ben bir motorsuz taşıtım.");
    }
}
