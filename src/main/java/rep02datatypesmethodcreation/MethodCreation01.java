package rep02datatypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {
        /* Java da method nasıl olusturulur?
    1)main methodun dısında classın ıcınde olusturulur
    2) Access Modifier + return type + method ismi + () + {}

    Olusturulan methodlar nasil kullanilir?
 1) Methodu olusturmak methodu calistirmak icin yeterli degildir.Kullanilmak istenen method
     main method un icinden kullanilir
 2) method'un ismini + () yazin
 3) varsa islem yapacagınız datalari parantezin icine koyun
     bu islem method call (method cagirma) olarak adlandirilir
4) method name + parametreler ==> method signature

     */  //Ornek1
        int sonuc =toplama(3,5,8);
        System.out.println("sonuc = " + sonuc);

        //Ornek2
       double carpim = carpma(6,9);
        System.out.println("carpim = " + carpim);

        //Ornek3
        System.out.println("dikdortgenin alani = " + alan(11, 15));

        //Ornek4
        System.out.println("dikdortgenin cevresi = " + cevre(5, 8));


    }
    //Ornek 1: toplama islemi yapan bir method olusturun ve kullanınız
    public static int toplama(int a, int b, int c){
        return a+b+c;
    }
    //Ornek 2 : 2 sayıyı carpma islemi yapan bir method olusturun ve kullanın
    private static double carpma(int a, int b){
        return a*b;
    }
    //Ornek 3: Dikdortgenin alanını hesaplayan methodu olusturun ve kullanın
    private static double alan(int kisa, int uzun){
        return kisa*uzun;
    }
    //Ornek 4:Dikdortgenin cevresini hesaplayan methodu olussturun ve kullanın
    public static int cevre(int a, int b){
        return 2*(a+b);
    }
}
