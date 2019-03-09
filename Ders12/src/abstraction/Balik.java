package abstraction;

public class Balik extends Hayvan {
    @Override
    void yemek() {
        System.out.println("Baliklar deniz ürünleri yerler.");
    }

    @Override
    void hareket() {
        System.out.println("Baliklar yüzerek hareket ederler.");
    }
}
