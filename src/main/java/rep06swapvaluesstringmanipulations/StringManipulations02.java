package rep06swapvaluesstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        String s="Merak ilmin hocasidir";
        //Ornek 1: "s" string inin "sidir" ile bitip bitmedigini kontrol edin
        boolean bitiyormu=s.endsWith("sidir");
        System.out.println(bitiyormu);//true evet yani "sidir" ile bitiyor

        //Ornek 2: "s" string indeki "hoca" kelimesini "tetikleyici" kelimesine cevirin
        String degistir=s.replace("hoca","TETIKLEYICI");
        System.out.println(degistir);//Merak ilmin TETIKLEYICIsidir

        //Ornek 4: "s" stringindeki tüm "i" harflerini "*" a cevirin
        String cevir=s.replace('i','*');
        System.out.println(cevir);//Merak *lm*n hocas*d*r

        //Ornek 6:"s" stringindeki tüm "i" harflerini silin
        String sil=s.replace("i","");
        System.out.println(sil);//Merak lmn hocasdr

        //YENİ BİR METHOD
        String t="Tekrar iyidir velevki 180 kere olsun!*?,,...11235813";
        //Note:Bir grup datayi ifade etmek icin "Regular Expressions" Regex kullaniriz
        //Note:Bir grup datayi degistirmek icin replaceAll()kullanilir

        /*
         **********Meshur Regex ler ********

         1) Tum rakamlar               ==> [0-9]
         2) Tum kucuk harfler          ==> [a-z]
         3) Tum buyuk harfler          ==> [A-Z]
         4) Tum Kucuk ve buyuk harfler ==> [a-zA-Z]
         5) Tum harfler ve rakamlar    ==> [a-zA-Z0-9]
         6) Tum noktalama isaretleri   ==> \\p{Punct}
         7) Tum sesli Harfler          ==> [aeiouAEIOU]
         8) Tum x,q,w harfleri         ==> [xqw]


         ******* Olumsuz Regex ler ******

         9) Kucuk harflerden farkli tum characterler => [^a-z]
        10) Tum harflerden farkli tum characterler   =>[^a-zA-Z]
        11) Tum rakamlar --> \\d    Rakamlar haric-->\\D
        12) Tum space ler -->\\s    Space ler haric -->\\S
        */

        String yildizYap=t.replaceAll("[0-9]","*");
        System.out.println(yildizYap);//Tekrar iyidir velevki *** kere olsun!*?,,...********

        String unlemYap=t.replaceAll("[^0-9]","!");
        System.out.println(unlemYap);//!!!!!!!!!!!!!!!!!!!!!!180!!!!!!!!!!!!!!!!!!!11235813!

        String ooo= t.replaceAll(" ","OOO");
        System.out.println(ooo);//TekrarOOOiyidirOOOvelevkiOOO180OOOkereOOOolsun!*?,,...11235813

        String uuu=t.replaceAll("[a-zA-Z0-9]","#");
        System.out.println(uuu);//###### ###### ####### ### #### #####!*?,,...########

        String iii=t.replaceAll("\\p{Punct}","&");
        System.out.println(iii);//Tekrar iyidir velevki 180 kere olsun&&&&&&&&11235813

        String i2=t.replaceAll("[^aeiouAEIOU]","");
        System.out.println(i2);//eaiiieeieeou (tum sesli harfler haric hiclik yapti


    }
}
