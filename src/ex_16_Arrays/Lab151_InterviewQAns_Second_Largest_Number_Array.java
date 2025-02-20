package ex_16_Arrays;

import java.util.Arrays;

public class Lab151_InterviewQAns_Second_Largest_Number_Array {
    public static void main(String[] args) {

       //find the second largest number from array
        int[] a1 = {89, 45, 76};

        Arrays.sort(a1); //

        System.out.println(a1[a1.length-2]); //76

    }
}
