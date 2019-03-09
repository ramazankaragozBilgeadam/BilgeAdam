package polymorphism;

//final olarak tanımlanan sınıf extends edilemez.

/*public final class Sekiller {*/

public class Sekiller {


    public double alanHesapla(){
        return 0;
    }

    public double cevreHesapla(){
        return 0;
    }

    //Super sınıfta final olarak belirlenen method
    // altsınıf tarafından override edilemez.
    /*public final double cevreHesapla(){
        return 0;
    }*/
}
