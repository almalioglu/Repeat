package rep01variables;

public class Variables {
    public static void main(String[] args) {
        String name="yusuf";//cift tirnak "" icinde yazilir. Non-Primitive Data type dir.
        System.out.println(name);

        char sube = 'A';//tek tirnak '' icinde yazilir. Primitive Data Type dir
        System.out.println(sube);

        boolean evlimisin= false;//false veya true yazdirir. Primitive Data Type dir
        boolean bekarmisin =true;
        System.out.println(evlimisin);
        System.out.println(bekarmisin);

        byte age =38; //Primitive Data Type dir.  -128 ile 127 arasi tam sayilar icindir
                      //1BYTE yer kaplar
        System.out.println(age);

        short ilceNufusu=23000;//Primitive Data Type dir.-32768 den + 32767 e (dahil) tamsayi degerleri icindir
        System.out.println(ilceNufusu);//2BYTE yer kaplar

        int dunyadakiGencler=2144555333;//Primitive Data Type dir.-2,147,483,648 ile 2,147,483,647 tamsayi degerleri icin
        System.out.println(dunyadakiGencler);//4BYTE yer kaplar

        long hucreSayisi=9222333444555666777L;//Primitive Data Type dir.
        System.out.println(hucreSayisi);//8BYTE yer kaplar. -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 tamsayilar

        float bagPrice=13.99f;//Primitive Data Type dir.Ondalik kismi az olan sayilar icindir
        System.out.println(bagPrice);//4BYTE yer kaplar.sonuna f veya F konur.

        double hucreAgirligi=0.00000000000003;//Primitive Data Type dir.Java ondalikli sayilari otomatik olarak double kabul eder.
        System.out.println(hucreAgirligi);//8BYTE yer kaplar.Ondalik kismi daha uzun sayilar ve tum sayilar icin kullanilir.
                                          //Double data type inde yazdigimiz tam sayi 9.0 gibi ondlikli yazilir.




    }
}
