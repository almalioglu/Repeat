package rep04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Ornek : kullanıcıda adresini aliniz ve ekrana yazdiriniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen adresinizi giriniz");
        String adres=input.nextLine();//nextLine() method u kullanicidan cok kelimeli String almak icin kullanilir.
        //kullanıcıdan hatırlatma bilgisi alınız ve ekrana yazdiriniz.
        System.out.println("lutfen bir hatirlatma cumlesi giriniz");
        String animsa=input.nextLine();

        System.out.println(adres+"\n"+animsa);//Fatih Mahallesi Merkez/Sivas
                                              //Seni Cok Seviyorum
    }
}
