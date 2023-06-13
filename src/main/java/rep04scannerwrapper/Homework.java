package rep04scannerwrapper;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // 1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen 3 tane sayi giriniz..");
        double sayi1=input.nextDouble();//3
        double sayi2=input.nextDouble();//5
        double sayi3=input.nextDouble();//8
        System.out.println((sayi1+sayi2+sayi3)/3);//5.333333333333333

        // 2) Kullanicidan aldiginiz 3 basamakli sayinin rakamlari toplamini bulunuz
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz");
       int ucBasamakli= scan.nextInt();//358

       int basamak1=ucBasamakli%10;
       ucBasamakli=ucBasamakli/10;

       int basamak2=ucBasamakli%10;
       ucBasamakli=ucBasamakli/10;

       int basamak3=ucBasamakli%10;

        System.out.println(basamak1+basamak2+basamak3);//16 (3+5+8)
    }
}
