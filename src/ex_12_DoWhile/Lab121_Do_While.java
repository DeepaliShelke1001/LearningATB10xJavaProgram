package ex_12_DoWhile;

public class Lab121_Do_While {
    public static void main(String[] args) {
        int a = 0;
//        while( a< 0){
//            System.out.println(a);
//            a++;
//        }

        do {
            System.out.println(a);
            a++;
        } while (a < 0);
//Output will be 0 and after that checked 0< 0 this will become false.
    }
}
