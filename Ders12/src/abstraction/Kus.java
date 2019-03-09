package abstraction;

public class Kus extends Hayvan {
    @Override
    void yemek() {
        System.out.println("Kuşlar kuş yemi yerler.");
    }

    @Override
    void hareket() {
        System.out.println("Kuşlar kanatları ile uçarak hareket ederler.");
    }
}
