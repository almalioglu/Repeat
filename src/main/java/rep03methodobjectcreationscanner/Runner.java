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

    }
}
