package lambda;

public class Anonim implements AnonimFonksiyon {

    public static void main(String[] args) {

        Anonim anonim=new Anonim();
        int sonuc=anonim.hesapla(3,2);
        System.out.println("Sonuc: "+sonuc);

    }

    @Override
    public int hesapla(int x, int y) {

        return x+y;
    }
}
