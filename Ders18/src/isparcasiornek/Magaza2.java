package isparcasiornek;

public class Magaza2 extends Thread {

    private Depo monitorDepo;
    private Depo klavyeMouseDepo;
    private Depo kasaDepo;

    public Magaza2(){

    }

    public Magaza2(Depo monitorDepo,Depo klavyeMouseDepo,Depo kasaDepo){
        super("Magaza2");
        this.monitorDepo=monitorDepo;
        this.klavyeMouseDepo=klavyeMouseDepo;
        this.kasaDepo=kasaDepo;
    }

    @Override
    public void run() {

        while (true) {
            try {
                sleep(4500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            kasaDepo.get();
            klavyeMouseDepo.get();
            monitorDepo.get();
        }



    }
}
