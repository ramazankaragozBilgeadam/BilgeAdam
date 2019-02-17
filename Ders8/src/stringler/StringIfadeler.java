package stringler;

public class StringIfadeler {

    public static void main(String[] args) {

        String jv="Merhaba Java";
        String a=new String("MerhabaJava");
        //String a="Merhaba Java";
        System.out.println(jv);
        System.out.println(a);

        System.out.println("java değişkeninin boyutu "+jv.length());
        System.out.println("a değişkeninin boyutu "+a.length());

        if (jv==a){
            System.out.println("eşit");
        }

        if (jv.equals(a)){
            System.out.println("Equals ile eşittir.");
        }





    }
}
