package rep05concatinationoperatorstypecasting;

public class AsciiValues {
    public static void main(String[] args) {
        /*
        java da her karakterin sayisal bir degeri vardir
        Bu degerler ASCII degerler olarak adlandirilir
        Bu degerlerin tamaminin bulundugu tabloya ASCII Table denir
         */
        char a='x';
        System.out.println(a);//

        //Herhangi bir character'in ASCII degerini bulmak icin o karakteri "int" data type inda bir variable icine koyunuz
        int yildiz='*';
        System.out.println(yildiz);//*-->42
        int aHarfi='a';
        System.out.println(aHarfi);//a-->97
        byte unlem='!';
        System.out.println(unlem);//!-->33
        int unlem2='!';
        System.out.println(unlem2);//!-->33

        //java da char lari matematiksel islemlerde kullanirsaniz, java char larin ASCII degerlerini kullanir
        char kHarfi='k';
        char lHarfi='l';
        System.out.println("k+l  :" +(kHarfi+lHarfi));//k+l  :215
        System.out.println(kHarfi+lHarfi);//215
    }
}
