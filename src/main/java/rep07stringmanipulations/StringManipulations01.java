package rep07stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Note:Bir grup datayi ifade etmek icin "Regular Expressions" Regex kullaniriz
        //Note:Bir grup datayi degistirmek icin replaceAll()kullanilir
        /*
        Meshur Regex
        1)Tum  rakamlar ==> [0-9]
        2)Tum kucuk harfler==> [a-z]
        3)Tum buyuk harfler==> [A-Z]
        4)Tum kucuk ve buyuk harfler==> [a-zA-Z]
        5)Tum harfler ve rakamlar ==>[a-zA-Z0-9]
        6)Tum noktalama isaretleri==>\\p{Punct}
        7)Tum sesli harfler ==> [aeiouAEIOU]
        Tum x,q,w harfleri     ==> [xqw]i

        8)Kucuk harflerden farkli tum characterler ==>[^a-z]
        9)Tum harflerden farkli tum characterler ==>  [^a-zA-Z]
        10) sadece space karakteri ==>\\s
        space karakteri haric ==>\\S
        sadece rakamlar ==>\\d
        rakamlar haric ==>\\D
        */
        String t="Java hep 18 yasindadir!!!***...";
        //Ornek1: "t" stringindeki tum rakamlari "*" ceviriniz
        System.out.println(t.replaceAll("[0-9]", "*"));//Java hep ** yasindadir!!!***...

        //Ornek 2: "t" stringindeki tum rakamlari ve harfleri "!" isaretine cevirin
        System.out.println(t.replaceAll("[0-9a-zA-Z]", "!"));//!!!! !!! !! !!!!!!!!!!!!!***...

        //Ornek 3:"t" stringindeki tum sesli harfleri "?"soru isaretine cevirin
        System.out.println(t.replaceAll("[aiouAIOU]", "?"));//J?v? hep 18 y?s?nd?d?r!!!***...

        //Ornek 4:"t" stringindeki kucuk harfler disindaki tum karakterleri"<>" e cevirin
        System.out.println(t.replaceAll("[^a-z]", "<>"));//<>ava<>hep<><><><>yasindadir<><><><><><><><><>

        //Ornek 5:"t" stringindeki tum harfler disindaki karakterleri"+" a cevirin
        System.out.println(t.replaceAll("[^a-zA-Z]", "+"));//Java+hep++++yasindadir+++++++++

        //Ornek 6: "t" stringindeki space ler disindaki herseyi "?" ne cevirin
        System.out.println(t.replaceAll("\\S", "?"));//???? ??? ?? ???????????????????

        //Ornek 7:"t" stringindeki sesli harfler haric tum karakterleri "&" e cevirin
        System.out.println(t.replaceAll("[^aeiouAEIOU]", "&"));//&a&a&&e&&&&&&a&i&&a&i&&&&&&&&&&

    }
}
