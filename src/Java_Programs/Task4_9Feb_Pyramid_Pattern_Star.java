package Java_Programs;

public class Task4_9Feb_Pyramid_Pattern_Star {
    public static void main(String[] args) {

//✅ Pyramid Star Pattern
//   *
//
//  ***
//
//  *****
//
// *******
//
//*********

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
