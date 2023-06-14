package rep06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String bir non-primitive data type dir ve ayni zamanda bir classdir

        String s = "Guzel goren guzel dusunur";
        //Ornek1: "s" Stringindeki tum characterleri BUYUK harf yapiniz
        String buyuk=s.toUpperCase();
        System.out.println(buyuk);

        //Ornek2: "s" Stringindeki tum characterleri KUCUK harf yapiniz
        String kucuk=s.toLowerCase();
        System.out.println(kucuk);

        //Ornek 3: "s" Stringindeki İLK characteri aliniz
        char ilk=s.charAt(0);
        System.out.println(ilk);

        //Ornek 4: "s" stringindeki ikinci ve sondan ikinci karakteri yazınız
        char ikinci=s.charAt(1);
        char sondanIkınci=s.charAt(s.length()-2);
        System.out.println(""+ikinci+sondanIkınci);//basa koydugumuz "" string olarak algilasin toplama yapmasin diye

        //Ornek 5: "s" stringinde kullanilan CHARACTER sayisini bulunuz
        int karakterSayisi=s.length();
        System.out.println(karakterSayisi);

        //Ornek 6:"s" string'indeki ilk 4 characteri aliniz
        //substring kullaniminda ilk index dahildir,ikinci index harictir
        String ilkDort=s.substring(0,4);
        System.out.println("ilkDort = " + ilkDort);

        String x=s.substring(2);//2. index ten sonuna kadar yazar (0,1 haric)
        System.out.println("x = " + x);//x = zel goren guzel dusunur

        //Ornek 9:"s" stringindeki "guzel" kelimesinin var olup olmadigini kontrol edin(ICERIYOR MU)
        boolean iceriyormu=s.contains("guzel");
        System.out.println(iceriyormu);//true
        boolean iceriyormu2=s.contains(" ");
        System.out.println(iceriyormu2);//true yani bosluk iceriyor

        //Ornek 10: "s" stringinin belli bir harfle ya da harflerle baslayip baslamadigini kontrol ediniz
        boolean basliyormu=s.startsWith("Guzel");
        System.out.println(basliyormu);//true yani evet "Guzel" ile basliyor

        //Ornek 11:"s" string'inin 5. index dahil olmak uzere bu index ten itibaren "r" characteri ile baslayip baslamadigini kontrol edin
        boolean r_ilemi=s.startsWith("r",5);
        System.out.println(r_ilemi);//false
        boolean g_ilemi=s.startsWith("g",6);
        System.out.println(g_ilemi);//true






    }
}
