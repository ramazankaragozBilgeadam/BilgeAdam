package ikiboyutludizi;

public class DiziCaprazToplamApp {

    public static void main(String[] args) {

        int[][] dizi={{3,4,1},{8,4,6},{2,4,15}};

        for (int i=0;i<dizi.length;i++){

            for (int k=0;k<dizi[i].length;k++){

                System.out.print(dizi[i][k]+" ");
            }
            System.out.println();
        }


        int sayac=dizi.length;
        int sagCapraz=0;
        int solCapraz=0;
        int sonuc=0;

        for (int i=0;i<dizi.length;i++){

            sayac--;

            sagCapraz+=dizi[i][sayac];
            solCapraz+=dizi[i][i];
        }

        sonuc=sagCapraz-solCapraz;

        System.out.println("Sonuc: "+Math.abs(sonuc));


    }

}
