package diziler;

public class DizilerApp {

    public static void main(String[] args) {

        /*int[] dizi=new int[5];

        dizi[0]=5;
        dizi[1]=4;
        dizi[2]=3;
        dizi[3]=2;
        dizi[4]=1;

        System.out.println("Dizinin 0.indisi ve 1.elemanı "+dizi[0]);
        System.out.println("Dizinin 1.indisi ve 2.elemanı "+dizi[1]);
        System.out.println("Dizinin 2.indisi ve 3.elemanı "+dizi[2]);
        System.out.println("Dizinin 3.indisi ve 4.elemanı "+dizi[3]);
        System.out.println("Dizinin 4.indisi ve 5.elemanı "+dizi[4]);*/

        //Dizinin boyutunun sınırlarını aştığı için ArrayOutOfBoundsException hatası alınır.
        //dizi[5]=7;
        //System.out.println("dizinin 5.indisi "+dizi[5]);

        /*int[] dizi=new int[5];
        System.out.println("Dizinin 0.indisi ve 1.elemanı "+dizi[0]);
        System.out.println("Dizinin 4.indisi ve 5.elemanı "+dizi[4]);*/


        //Eğer ben bir diziye boyut atamazsam eğer,
        //Java bunu JVM'de bulunan heap memory'de oluşturamaz.
        //Bu yüzden compiler bizi dizinin boyutunu belirlememiz için uyarır.
        //int[] dizi=new int[];

        /*int[] dizi={5,4,3,2,1};
        System.out.println("Dizinin 0.indisi ve 1.elemanı "+dizi[0]);
        System.out.println("Dizinin 1.indisi ve 2.elemanı "+dizi[1]);
        System.out.println("Dizinin 2.indisi ve 3.elemanı "+dizi[2]);
        System.out.println("Dizinin 3.indisi ve 4.elemanı "+dizi[3]);
        System.out.println("Dizinin 4.indisi ve 5.elemanı "+dizi[4]);

        int diziBoyutu=dizi.length;
        System.out.println("Dizinin boyutu: "+diziBoyutu);
        System.out.println("Dizinin boyutu: "+dizi.length);*/

        /*int dizi[]=new int[5];
        System.out.println("Dizinin boyutu: "+dizi.length);

        dizi=new int[15];
        System.out.println("Dizinin yeni boyutu: "+dizi.length);*/


    }

}
