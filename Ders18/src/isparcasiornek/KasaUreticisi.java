package isparcasiornek;

public class KasaUreticisi extends Thread {

    private Depo depo;

    public KasaUreticisi(){

    }

    public KasaUreticisi(Depo depo){
        super("KasaUreticisi");
        this.depo=depo;
    }

    @Override
    public void run() {

        while (true) {
            try {
                sleep(1500);

            } catch (InterruptedException e) {

            }

            depo.put();
        }


    }
}
