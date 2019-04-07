package tasarimsablonlari.factory;

public class SekilFactory {


    private SekilFactory() {

    }

    public static Sekil getSekil(SekilType sekilType) {
        Sekil sekil = null;

        switch (sekilType) {
            case DIKDORGEN:
                sekil = new Dikdortgen();
                break;
            case KARE:
                sekil = new Kare();
                break;
            case UCGEN:
                sekil = new Ucgen();
                break;
            default:
                System.err.println("Belirtilen sekil bulumadı.");
                break;
        }

        return sekil;
    }

}
