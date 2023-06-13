package rep05concatinationoperatorstypecasting;

public class Concatination {
    public static void main(String[] args) {
        //Concatination--> Birlestirme
        //Ornek 1: Bir String ve iki integer variable olusturun. String degeri ile Integer larin toplamini console a yazdirin
        String meyve="Kiraz";
        int a=13;
        int b=19;
        System.out.println(meyve+a+b);//Kiraz1319
        System.out.println(meyve+(a+b));//Kiraz32
        System.out.println(meyve + a * b);//Kiraz247
        System.out.println(a + b + meyve);//32Kiraz
        System.out.println(a + meyve + b);//13Kiraz19
        //Java da "+" sembolu iki sayi arasinda kullanilirsa toplama islemi olur
        //Java da "+" sembolu iki string arasinda veya bir string ve bir sayi arasinda kullanilirsa "concatination"  islemi olur
        //"concatination" birlestirme yapar
        //Note : Concatination islemlerinde java matematik teki islem onceligi kurallarini kullanir

        /*
        Matematikte islem onceligi
        1)once uslu sayilar
        2)Parantez ici islemler yapilir
        3)Carpma ve Bolmeler yapilir
        4)Toplama ve cikarmalar yapilir
        5)Ayni oncelikli olanlarda soldan saga baslanir
         */

        //Ornek 2: Size String olarak verilen iki fıyat in toplamini ekrana yazdiriniz.
        String shirt = "2300";
        String shoes = "5200";
        int toplam=Integer.valueOf(shirt)+Integer.valueOf(shoes);
        System.out.println(toplam);//7500

        //Ornek 3: Size String olarak verilen iki fiyat'in toplamini ekrana yazdiriniz
        String tv = "$1100";
        String radio="$300";
       int totalPrice= Integer.valueOf(tv)+Integer.valueOf(radio);
        System.out.println(totalPrice);//Hata verdi cunku valueOf() methodu tum karakterleri rakam olan Stringleri sayilara cevirir
        //Eger valueOf() methodu kullanilirken Stirng in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz
        //valueOf() methoud kullanilirken sadece rakam olan karakterler kullanilmalidir.
    }
}
