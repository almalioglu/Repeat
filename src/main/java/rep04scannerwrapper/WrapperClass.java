package rep04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
        // primitive ile non-primitive arsındaki fark : METHOD dur. Primitive de Method yok
        //Primitive    :       char   -  boolean -  byte - short - int    -  long - float - double
        //Wrapper Class: Character-  Boolean -  Byte - Short - Integer - Long - Float - Double
        //Wrapper Class larda method (aktif ozellik) var
        //Wrapper Class lar non-primitive dir. Bundan dolayi memmory de cok yer kaplarlar.dolayisiyla sart
        //degilse Wrapper Class kullanmayi tercih etmeyiz ama var oldugunu biliriz

        int a=12;// a yazip nokta koyarsaniz hic method göremezsiniz cünkü primitive ler method icermez
        Integer b=15;//b yazip nokta koyarsaniz bircok method görürsünüz cünkü Wrapper Class lar method icerir

        //Short data type nin min ve max degerlerini kod yazarak bulunuz
       short minShort= Short.MIN_VALUE;
        System.out.println("Short min :" +minShort);//Short min :-32768
       short maxShort= Short.MAX_VALUE;
        System.out.println("Short Max :" +maxShort);//Short Max :32767

        //Ornek 2: int data type nin minimum degeri ile byte data type nin maximum degerinin toplamini bulunuz
        int minInt= Integer.MIN_VALUE;
        byte maxByte= Byte.MAX_VALUE;
        System.out.println(minInt+maxByte);//-2147483521

        //Ornek 3: Primitive int i wrapper Integer a ceviriniz (Autoboxing)
        int yas=38;
        Integer yeniYas=yas;
        System.out.println(yeniYas);

        //Ornek 4: Wrapper Byte i primitive byte a ceviriniz (Unboxing)
        Byte kilo=123;
        byte kilo2=kilo;
        System.out.println(kilo2);

        //Ornek 5: Primitive char i Wrapper Character e ceviriniz
        char inital= 'x';
        Character initalWrapper=inital;

        //Ornek 6 : Wrapper Boolean i primitive boolean a ceviriniz
        Boolean isOldWrapper= true;
        boolean isOldPrimitive = isOldWrapper;
    }
}
