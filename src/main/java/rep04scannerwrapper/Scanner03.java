package rep04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Ornek : Kullaniciden iki sayi alip dort islem yapan ve islemlerin sonuclarini ekrana yazdiren kodu yaziniz
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen iki tane sayi giriniz");
       double firstNumber= input.nextDouble();
       double lastNumber= input.nextDouble();
        System.out.println(firstNumber+lastNumber);//11.0
        System.out.println(firstNumber-lastNumber);//5.0
        System.out.println(firstNumber*lastNumber);//24.0
        System.out.println(firstNumber/lastNumber);//2.6666666666666665
    }
}
