package Java_Programs;

import java.util.Arrays;

public class Task2_9Feb_Sec_Smallest_Num_Array {
    public static void main(String[] args) {


        //find the second smallest number from array
        int[] a1 = {89, 45, 76, 1, 25};

        Arrays.sort(a1); //

        System.out.println(a1[a1.length - 4]); //25
        //OR
        System.out.println(a1[1]); //25
    }
}
