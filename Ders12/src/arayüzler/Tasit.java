package arayüzler;

/**
 * Bir interface %100 soyut bir sınıftır.
 * Bir interface sadece STATIC, FINAL ve PUBLIC alanlara ve ABSTRACT metotlara sahip olabilir.
 * Bir interface içi dolu static metota sahip olabilir.
 * Bir interface birden fazla implements edileblir.Uygulanabilir.
 * Bir interface başka bir interface'den birden fazla extends edilebilir.
 */
public interface Tasit extends A,B{

    public static final boolean tasitDurumu=true;
    public abstract void hareketEt();
    public void hareketsizKal();

    public static boolean tanim(){
        System.out.println("Ben bir taşıtım.");
        return true;
    }
}
