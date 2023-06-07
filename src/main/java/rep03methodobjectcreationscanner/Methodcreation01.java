package rep03methodobjectcreationscanner;

public class Methodcreation01 {
    public static void main(String[] args) {
        //Ornek 1:
        double kup = getCube(4.5);
        System.out.println("kup = " + kup);

        //Ornek 2:
        kelime("merhaba");

        //Ornek 3:
        System.out.println("carpma(3,5) = " + carpma(3, 5));

        //Ornek 4:
        kare(5);



    }

    //Ornek 1: Verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullanınız.
    public static double getCube(double a) {
        return a * a * a;
    }

    //Ornek 2: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
    private static void kelime(String a) {
        System.out.println(a);
    }

    //Ornek 3: Verilen 2 tam sayıyı carpan ve sonucu ekrana yazdıran methodu olusturup kullanınız
    protected static int carpma(int a, int b) {
        return a * b;
    }
    //Ornek 4: Verilen bir tam sayinin karesini hesaplayip consola yazdiran method u olusturup kullaniniz
    public static void kare(int a){
        System.out.println("karesi :"+a*a);
    }

}
