package rep03methodobjectcreationscanner;

public class Homework {
    public static void main(String[] args) {
        //Homework1.
        double pi=3.14;
        double r=7;
        cevre(pi,r);
        alan(pi,r);

    }
    // Homework1) Cemberin cevresini hesaplayan methodu oluşturup kullanın.
    public static void cevre(double pi, double r){
        System.out.println("Cemberin cevresi  = " + 2 * pi * r);
    }
    // Homework 2)Dairenin alanını hesaplayan methodu oluşturup kullanın.
    public static void alan(double pi,double r){
        System.out.println("Dairenin alani = " + pi * r * r);
    }
    //deneme : bir "kiralık ev" object i olusturalım
    //variable lar
    public String mahalle = "Fatih";
    public String cadde = "Fetih";
    public byte sokak = 53;
    public  short metreKare= 150;
    public  byte odaSayisi = 3;

    //method lar
    public void ilan(){System.out.println("Kiralik Ev");}
    public void adres(){System.out.println("Fatih mh 53 sk no:14");}
    public void konum(){System.out.println("Valilik binasinin arkasi");}
    public void aciklama(){System.out.println("Kiraci cocuklu olmasin");}
}
