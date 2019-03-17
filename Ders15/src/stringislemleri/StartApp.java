package stringislemleri;

public class StartApp {


    public static void main(String[] args) {

        /*String a="123";
        String c="123";
        String b="345";

        String x=c+b;

        a=a.concat("c");

        System.out.println(a);*/

        StringBuilder stringBuilder=new StringBuilder("Java");

        stringBuilder.append(" Bir Teklonojidir.").append(" 1995 Yılında")
                .append(" Yazılmıştır.");


        String ifade="James Gosling Tarafından ";

        System.out.println("İnsert edilmiş hali:");
        stringBuilder.insert(22,ifade);
        System.out.println(stringBuilder);

        System.out.println("Delete edilmiş hali:");
        stringBuilder.delete(22,22+ifade.length());
        System.out.println(stringBuilder);


        stringBuilder.reverse();
        System.out.println("Tersden yazılmış hali: "+stringBuilder);


        StringBuffer stringBuffer=new StringBuffer("Merhaba Java");
        System.out.println(stringBuffer);



    }
}
