package tasarimsablonlari;

import tasarimsablonlari.factory.Sekil;
import tasarimsablonlari.factory.SekilFactory;
import tasarimsablonlari.factory.SekilType;
import tasarimsablonlari.singleton.SingletonDesignPattern;

public class StartApp {

    public static void main(String[] args) {

       /* SingletonDesignPattern singletonDesignPattern=SingletonDesignPattern.getInstance();
        singletonDesignPattern.tanim();*/

        Sekil sekilDikdortgen= SekilFactory.getSekil(SekilType.DIKDORGEN);
        sekilDikdortgen.tanim();

        Sekil sekilKare=SekilFactory.getSekil(SekilType.KARE);
        sekilKare.tanim();



    }
}
