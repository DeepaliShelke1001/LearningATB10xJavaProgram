package ex_10_For_Loop;

public class Lab114_For_Loop_continue {

    public static void main(String[] args) {

        for (int a = 0; a < 50; a++) {
            if (a == 5) {
                continue; // skip below code, move to top
            }
            System.out.println(a);
        }
    }
}


// Output will be
// 0, 1, 2, 3, 4, 6, 7, 8............,49 // here 5 will be skipped and goto top
