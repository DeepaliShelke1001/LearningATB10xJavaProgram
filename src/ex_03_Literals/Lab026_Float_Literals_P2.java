package ex_03_Literals;

public class Lab026_Float_Literals_P2 {

    public static void main(String[] args) {
        //simple float literal
        //Both are supported i.e f or F
        float pi = 3.14f;
        float pi2 = 3.14F;

        final int a = 10;//10 is literal and this is integral literal but the value of a is constant i.e. 10

        final int AGE;
        AGE = 12;
        //AGE = 29; // we cannot reassign because its a final value.
        System.out.println(AGE);

        float x =10; //This possible because by default is 10.00 but not showing here.
        System.out.println(x);




    }
}
