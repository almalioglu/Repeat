package rep07stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        /*
        Ornek:
            Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
                1) En az 8 charcter olsun
                2) Space characteri passwordde olmasin
                3) En az bir buyuk harf olsun
                4) En az bir kucuk harf olsun
                5) En az bir rakam olsun
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir password giriniz");
        String password=scan.nextLine();

        //1) En az 8 charcter olsun
        boolean a1=password.length()>7;
        System.out.println("En az 8 karakter var mi? = " + a1);
        //2) Space characteri passwordde olmasin
        boolean a2=!password.contains(" ");
        System.out.println("Bosluk olmasin :" +a2);
        //3) En az bir buyuk harf olsun
        //Note : Buyuk harf olmayanlari sil
        //      kalan character sayisina bak
        //      character sayisi sıfır ise buyuk harf yok demektir
        //      sifirdan buyuk ise buyuk harf var demektir
        boolean a3=password.replaceAll("[^A-Z]","").length()>0;
        System.out.println("En az bir buyuk harf var mi?  = " + a3);
        //4) En az bir kucuk harf olsun
       boolean a4= password.replaceAll("[^a-z]","").length()>0;
        System.out.println("En az bir kucuk harf var mi? = " + a4);
        //5) En az bir rakam olsun
        boolean a5 =password.replaceAll("[^0-9]","").length()>0;
        System.out.println("En az bir rakam var mi? = " + a5);
    }
}
