package rep04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Ornek : Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //a) Alanini hesaplayiniz
        //b) Cevresini hesaplayiniz
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen Dikdortgenin kısa kenar uzunlugunu giriniz..");
        double shortSide =input.nextDouble();
        System.out.println("Lutfen Dikdortgenin uzun kenar uzunlugunu giriniz..");
        double longSide =input.nextDouble();
        System.out.println("Alan  :" +shortSide*longSide);//Alan  :273.0
        System.out.println("Cevre  :" +2*(shortSide+longSide));//Cevre  :68.0

    }
}
