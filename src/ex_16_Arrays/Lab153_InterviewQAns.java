package ex_16_Arrays;

import java.util.Arrays;

public class Lab153_InterviewQAns {
    public static void main(String[] args) {

        int a[]; // Valid case with no size

        int[] b = new int[-1]; // it will complied but gives runtime error as "NegativeArraySizeException

        int[] a1 = new int[5];// size - 5 and index - 0 to 4

        int[] a2 = new int[3]; //size 3
        a2[0] = -98; // We can store negative values
        a2[1] = -6;
        a2[2] = -758;


    }
}
