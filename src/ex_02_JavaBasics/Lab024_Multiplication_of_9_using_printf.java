package ex_02_JavaBasics;

public class Lab024_Multiplication_of_9_using_printf {

    public static void main(String[] args) {

        int d = 9;

        System.out.println("Table of 9 using printf method and table should be printed on new line");
        // First way : Using printf and new line
        System.out.printf("%d*1=%d\n",d,d*1);
        //Second way : printf and println on different line
        System.out.printf("%d*2=%d",d,d*2);
        System.out.println();
        //third way : printf and println one same line
        System.out.printf("%d*3=%d",d,d*3).println();

        System.out.printf("%d*4=%d",d,d*4).println();
        System.out.printf("%d*5=%d",d,d*5).println();
        System.out.printf("%d*6=%d",d,d*6).println();
        System.out.printf("%d*7=%d",d,d*7).println();
        System.out.printf("%d*8=%d",d,d*8).println();
        System.out.printf("%d*9=%d",d,d*9).println();
        System.out.printf("%d*10=%d",d,d*10).println();
    }
}


