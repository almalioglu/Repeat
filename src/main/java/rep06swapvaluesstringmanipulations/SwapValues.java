package rep06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
        //Swap : Yer degistirmek 1.kap Patates 2. kap Domates ==> swap => 1.Kap Domates  2. kap Patates
        int a=13;
        int b=19;
        int bos=0;
        System.out.println("a :" +a);
        System.out.println("b :" +b);
        //1.yol
        bos=a;//1.adim
        a=b;//2.adim
        b=bos;//3.adim
        System.out.println("a :" +a);
        System.out.println("b :" +b);
        //2.yol
        int x=22;
        int y=33;
        x=x+y;//1.adim
        y=x-y;//2.adim
        x=x-y;//3.adim
        System.out.println("x -> "+x);
        System.out.println("y -> "+y);
    }
}
