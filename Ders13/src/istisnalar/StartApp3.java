package istisnalar;

public class StartApp3 {

    public static void main(String[] args) {
        int yas=30;

        try{
            getYas(yas);
        }catch (IllegalStateException exception){
            System.out.println("Yaş değeri sıfırdan küçük olamaz");
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Dizinin elemanını yanlış yerde arıyorsun.");
        }catch (NumberFormatException ex){
            System.out.println("Sayı uygun değil.");
        }catch (Exception exception){
            System.out.println("super exceptiona yakalandınız.");
        }finally {
            System.out.println("Son olarak burayı çalıştır.");
        }

        System.out.println("Kod çalışıyor mu?");


    }

    public static int getYas(int yas) throws IllegalStateException,NumberFormatException{

        if (yas<0){
            IllegalStateException istisna=new IllegalStateException();
            throw istisna;
        }else if (yas>0){
            NumberFormatException istisna=new NumberFormatException();
            throw istisna;

        }

        return yas;
    }

}
