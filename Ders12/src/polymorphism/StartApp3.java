package polymorphism;

import java.util.ArrayList;
import java.util.Iterator;

public class StartApp3 {


    public static void main(String[] args) {

        //genisletebilirlilik();
        //dinamikDizi();
        genisletebilirlilikWithArrayList();
    }


    public static void genisletebilirlilik() {

        Sekiller sekiller = new Sekiller();
        Sekiller sekiller2 = new Sekiller();
        Dikdortgen dikdortgen = new Dikdortgen(3, 5);
        Dikdortgen dikdortgen2 = new Dikdortgen();
        dikdortgen.setEn(2);
        dikdortgen.setBoy(3);
        Kare kare = new Kare(9);
        Kare kare2 = new Kare();
        kare2.setKenar(7);

        Sekiller[] sekillerDizisi = new Sekiller[6];

        sekillerDizisi[0] = sekiller;
        sekillerDizisi[1] = sekiller2;
        sekillerDizisi[2] = dikdortgen;
        sekillerDizisi[3] = dikdortgen2;
        sekillerDizisi[4] = kare;
        sekillerDizisi[5] = kare2;

        sekillerAlanlari(sekillerDizisi);

    }

    public static void genisletebilirlilikWithArrayList() {

        Sekiller sekiller = new Sekiller();
        Sekiller sekiller1 = new Sekiller();
        Dikdortgen dikdortgen = new Dikdortgen(3, 2);
        Dikdortgen dikdortgen2 = new Dikdortgen(6, 7);
        Kare kare = new Kare(90);
        Kare kare1 = new Kare(50);
        ArrayList<Sekiller> arrayList = new ArrayList<>();

        ArrayList<Sekiller> sekillerList = new ArrayList<>();
        sekillerList.add(sekiller);
        sekillerList.add(sekiller1);
        sekillerList.add(dikdortgen);
        sekillerList.add(dikdortgen2);
        sekillerList.add(kare);
        sekillerList.add(kare1);

        //sekillerAlanlariWithArrayList(sekillerList);

        ArrayList<Sekiller> newSekillerList = new ArrayList<>();
        newSekillerList = getSifirdanBuyukOlanAlanlarIterator(sekillerList);
        sekillerAlanlariWithArrayList(newSekillerList);
    }

    public static ArrayList<Sekiller> getSifirdanBuyukOlanAlanlarIterator(ArrayList<Sekiller> sekillerArrayList) {


        if (sekillerArrayList.size() > 0) {

            for (Iterator<Sekiller> iterator = sekillerArrayList.iterator(); iterator.hasNext(); ) {

                Sekiller sekil = iterator.next();
                if (sekil.alanHesapla() == 0) {
                    iterator.remove();
                }
            }
        }


        return sekillerArrayList;

    }

    public static ArrayList<Sekiller> getSifirdanBuyukOlanAlanlar(ArrayList<Sekiller> sekillerArrayList) {

        if (sekillerArrayList.size() > 0) {

            for (Sekiller sekil : sekillerArrayList) {

                if (sekil.alanHesapla() == 0) {

                    sekillerArrayList.remove(sekil);

                }
            }
        }
        return sekillerArrayList;

    }

    public static void sekillerAlanlariWithArrayList(ArrayList<Sekiller> sekillerList) {

        if (sekillerList.size() > 0) {
            for (Sekiller sekil : sekillerList) {
                System.out.println("Sekil alani: " + sekil.alanHesapla());
            }
        }
    }

    public static void sekillerAlanlari(Sekiller[] sekillerDizi) {

        if (sekillerDizi.length > 0) {
            for (Sekiller sekiller : sekillerDizi) {
                System.out.println("Sekillerin alani:"
                        + sekiller.alanHesapla());
            }
        }

    }


    public static void dinamikDizi() {

        ArrayList<Integer> subList = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();


        for (int i = 1; i < 10; i++) {
            arrayList.add(i);
        }


        System.out.println("Temizlemeden önceki boyutu: " + arrayList.size());
        //System.out.println(arrayList.get(0));
        //System.out.println(arrayList.get(1));
        //System.out.println(arrayList.get(2));
        //System.out.println(arrayList.get(3));

        arrayList.remove(3);

        subList.add(10);
        subList.add(11);
        subList.add(12);

        arrayList.addAll(subList);

        for (Integer eleman : arrayList) {
            System.out.println(eleman);
        }

        arrayList.clear();
        System.out.println("Temizlendikten sonraki boyutu: " + arrayList.size());

        //System.out.println(arrayList.get(0));

    }
}
