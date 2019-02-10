package diziler;

public class DiziForApp {

    public static void main(String[] args) {

        int[] dizi=new int[5];

        for (int i=0;i<dizi.length;i++){

            dizi[i]=i+2;

        }

        for (int i=0;i<dizi.length;i++){

            System.out.println("Dizinin "+i+". indisinin değeri "+dizi[i]);

        }

    }

}
