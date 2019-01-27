package ilkeltipler;

public class Main {

    public static void main(String[] args){

        int a=5;
        System.out.println("Bu bir integer değer: "+a);
        Integer b=5;
        System.out.println("Bu bir integer değer: "+b);
        Integer c=new Integer(5);
        System.out.println("Bu bir integer değer: "+c);

        int x;
        x=12;
        x=7;
        System.out.println(x);

        long along=2l;
        System.out.println("Bu bir long değer: "+along);
        Long bLong=2L;
        System.out.println("Bu bir long değer: "+bLong);
        Long cLong=new Long(2);
        System.out.println("Bu bir long değer: "+cLong);

        short aShort=50;
        System.out.println("Bu bir short değer: "+aShort);
        Short bShort=50;
        System.out.println("Bu bir short değer: "+bShort);
        Short cShort=new Short((short) 50);
        System.out.println("Bu bir short değer: "+cShort);

        byte aByte=20;
        System.out.println("Bu bir byte değer: "+aByte);
        Byte bByte=20;
        System.out.println("Bu bir byte değer: "+bByte);
        Byte cByte=new Byte((byte) 20);
        System.out.println("Bu bir byte değer: "+cByte);

        char achar='a';
        System.out.println("Bu bir char değer: "+achar);
        Character bChar='a';
        System.out.println("Bu bir char değer: "+bChar);
        Character cChar=new Character('a');
        System.out.println("Bu bir char değer: "+cChar);

        String aString="abcde";
        System.out.println("Bu bir char değer: "+aString);
        String bString=new String("abcde");
        System.out.println("Bu bir char değer: "+bString);


    }
}
