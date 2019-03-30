package isparcasiornek;

public class KlavyeMouseUretici extends Thread {

    private Depo depo;

    public KlavyeMouseUretici(){

    }

    public KlavyeMouseUretici(Depo depo){
        super("KlavyeMouseUreticisi");
        this.depo=depo;
    }

    @Override
    public void run() {

        while (true) {
            try {

                sleep(1500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            depo.put();
        }


    }
}
