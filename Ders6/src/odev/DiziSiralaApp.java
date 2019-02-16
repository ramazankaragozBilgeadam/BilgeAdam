package odev;


/*
Dizideki elenanları küçükten büyüğe doğru sıralayan ve ekrana yazdıran program.
 */
public class DiziSiralaApp {

    public static void main(String[] args) {

        int[] dizi={7,3,125,9,1,0,17,88,22,4}; //Cevap: 0,1,3,4,7,9,17,22,88,125

        System.out.println("Dizimizin boyutu: "+dizi.length);

        int i;
        int k;
        int temp=0;

        for (i=0;i<dizi.length;i++){
            for (k=i+1;k<=dizi.length-1;k++){
                if (dizi[i]>dizi[k]){

                    temp=dizi[k];
                    dizi[k]=dizi[i];
                    dizi[i]=temp;

                }
            }

        }


        String sonuc="";

        for (int diziElamani:dizi){
            sonuc+=diziElamani+" "; //sonuc=sonuc+diziElamani
        }

        System.out.println("Dizinin sıralı hali: "+sonuc);
    }
}
