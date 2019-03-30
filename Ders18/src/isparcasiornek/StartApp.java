package isparcasiornek;

public class StartApp {

    public static void main(String[] args) {

        Depo monitorDepo=new Depo("MonitorDepo");
        Depo klavyeMouseDepo=new Depo("KlavyeMouseDepo");
        Depo kasaDepo=new Depo("KasaDepo");

        new MonitorUretici(monitorDepo).start();
        new KlavyeMouseUretici(klavyeMouseDepo).start();
        new KasaUreticisi(kasaDepo).start();

        new Magaza1(monitorDepo,klavyeMouseDepo,kasaDepo).start();

        try {
            Thread.sleep(6500);
        } catch (InterruptedException e) {

        }

        new Magaza2(monitorDepo,klavyeMouseDepo,kasaDepo).start();

        while (true){
            System.out.println(monitorDepo.toString()+" "
                    +klavyeMouseDepo.toString()+" "+kasaDepo.toString());
        }

    }
}
