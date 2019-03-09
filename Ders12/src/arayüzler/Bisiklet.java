package arayüzler;

public class Bisiklet implements Tasit,MotorsuzTasit {

    @Override
    public void hareketEt() {
        System.out.println("Bisiklet harekete geçti.");
    }

    @Override
    public void hareketsizKal() {
        System.out.println("Bisiklet hareketsiz durumda.");
    }

    @Override
    public void sur() {
        System.out.println("Bisiklet gidiyor.");
    }
}
