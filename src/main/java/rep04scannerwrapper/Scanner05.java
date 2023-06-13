package rep04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz.
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
       int number= input.nextInt();
        //Bir tam sayiyi bir tam sayiya bolerseniz sonuc JAVA da hep tam sayidir,yuvarlama yapmaz ondalik kısmini siler.
        //Bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolup kalani almaliyiz
        //% => modulus operator , solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir.
        //dolayisiyla %10 herzaman birler basamagini verir.
        //Dolayisiyle bir tam sayiyi 10 a bolersek birler basamagini silmis oluruz

        int birlerBasamagi=number%10;//birler basamagini aldik
        number=number/10;//birler basamagini sildik

        int ikinciBasamak=number%10;//sondan ikinci basamagi aldik
        number=number/10;//onlar basamagini sildik

        int ucuncuBasamak=number%10;//sondan ucuncu (yuzler) basamagini aldik
        number=number/10;//yuzler basamagini sildik

        int dorduncuBasamak=number%10;//sondan dorduncu(bınler) basamagini aldik
         number=number/10;//sondan dorduncu (binler) basamagini sildik

        int besinciBasamak=number%10;//son basamagini(onbinler) aldik.

        System.out.println(birlerBasamagi+ikinciBasamak+besinciBasamak+dorduncuBasamak);//36  (sayimiz 99999 idi)
    }
}
