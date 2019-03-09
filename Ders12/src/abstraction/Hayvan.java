package abstraction;

/**
 * Soyutlama karmaşıklığı kullanıcıdan gizlemeye odaklanır,
 * sadece kullanıcıya ilgili olduğu davranışları ve özellikleri göstermeyi amaçlar.
 *
 *Örneğin, bir arabayı kullanırken iç aksamının nasıl çalıştığını bilmenize gerek yoktur.
 * Sadece arabayı kullanırsınız.
 *
 * Aynısı java sınıfları için'de geçerlidir.Soyut sınıfları ve interfaceleri kullanarak uygulamanın ayrıntılarını gizleyebilir.
 * Abstract methodlar tanımlarız bunu diğer sınıfların kullanımına sunarız.Diğer sınıflar da bunları kendi yöntemlerine göre uygular.
 *
 *Datanın altında yatan karmaşıklığı gizler.
 * Tekrarlayan kodları önlemeye yardımcı olur.Inheritence özelliği ile.
 * Yalnızca tanımlı methodların uygulanmasını sağlar.
 * Soyut davranışlar ile esneklik kazanır.Polymorphism uygulamamızı sağlar.(Interface)
 *
 * Abstract sınıf, somut olmayan bir üst sınıftır.
 * Hem abstract hem de abstract olmayan methodlar yazılabilir.
 * Abstract sınıflar, abstract anahtar sözcüğü ile tanımlanır.
 * Abstract sınıfların, abstract methodları alt sınıflar tarafından implement edilmek zorundadırlar.
 */
public abstract class Hayvan {

    abstract void yemek();
    abstract void hareket();

    public void tanim(){
        System.out.println("Bu bir hayvan verisidir.");
    }
}
