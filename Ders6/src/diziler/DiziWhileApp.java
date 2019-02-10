package diziler;

public class DiziWhileApp {

    public static void main(String[] args) {

        int[] dizi=new int[100];

        int i=0;

        while (i<dizi.length){

            dizi[i]=i+2;
            i++;
        }

        i=0;
        while (i<dizi.length){
            System.out.println("Dizinin "+i+". indisinin degeri "+dizi[i]);
            i++;
        }

    }

}
