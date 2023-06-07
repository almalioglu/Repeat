package rep03methodobjectcreationscanner;

public class Runner {
    public static void main(String[] args) {
        //Object olusturalim
        Student myStd=new Student();
        myStd.study();
        myStd.feed();
        System.out.println("adresi :"+Student.adress);

        Car myCar= new Car();
        System.out.println(myCar.marka);
        System.out.println(myCar.model);
        System.out.println(myCar.year);

        myCar.cam();
        myCar.koltuk();
        myCar.far();

        Teacher myTeacher = new Teacher();
        System.out.println(myTeacher.isim);
        System.out.println(myTeacher.age);
        myTeacher.teach();

        Homework kiralikEv= new Homework();
        System.out.println(kiralikEv.mahalle);
        System.out.println(kiralikEv.cadde);
        System.out.println(kiralikEv.sokak);
        System.out.println(kiralikEv.metreKare);
        System.out.println(kiralikEv.odaSayisi);
        kiralikEv.ilan();
        kiralikEv.adres();
        kiralikEv.konum();
        kiralikEv.aciklama();


    }
}
