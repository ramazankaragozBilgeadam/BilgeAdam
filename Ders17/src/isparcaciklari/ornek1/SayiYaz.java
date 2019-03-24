package isparcaciklari.ornek1;

public class SayiYaz implements Runnable {

    private int sayi;
    private int yazmaSayisi;
    int i;

    public SayiYaz(){

    }

    public SayiYaz(int sayi, int yazmaSayisi){
        this.sayi=sayi;
        this.yazmaSayisi=yazmaSayisi;
    }

    @Override
    public void run() {
        for (i=0;i<yazmaSayisi;i++){
            System.out.print(sayi);
        }
    }
}
