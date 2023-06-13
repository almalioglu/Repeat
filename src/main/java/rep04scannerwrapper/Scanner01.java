package rep04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Ornek : Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen ilk isminizi giriniz..");
        String firstName =input.next();
        System.out.println("Lutfen soyadinizi giriniz..");
        String lastName=input.next();
        System.out.println(firstName +" "+ lastName);//İsmail Almalıoğlu


    }
    }

