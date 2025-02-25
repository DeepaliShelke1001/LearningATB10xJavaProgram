package Java_Programs;

import java.util.Arrays;

public class Task1_9Feb_Sort_Array_without_fun {
    public static void main(String[] args) {

//        Sort the array → int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
//
//        1,3,4,10,12,32,34,100
//
//        without using any functions.
//
//        Hint - compare and replace(temp)

        int[] array1 = {12, 34, 10, 1, 100, 3, 4, 32};

        //Sort the array without functions

        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = 0; j < array1.length - 1 - i; j++) {
                if (array1[j] > array1[j + 1]) {
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array is ....");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

//        //Sort the array using function
//        Arrays.sort(array1);
//        //print sorted array values
//        for(int i =0; i<array1.length; i++) {
//            System.out.print(array1[i]+" ");
//        }
    }
}

//Output is
//Sorted array is ....
//1 3 4 10 12 32 34 100
