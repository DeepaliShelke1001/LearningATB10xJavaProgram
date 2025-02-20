package ex_16_Arrays;

public class Lab148_Array_InterviewQAns_Min_Max {
    public static void main(String[] args) {

        //Find the max value from an array
        int[] a1 = {51, 100, 91, 87, 90, 1002};

        //MAX, MIN

        //1. Inputs -> array - 51,100,91,87,90, 1002
        //output -> single int (max no) => 1002


        int max_output = give_max(a1);
        System.out.println("Maximum number from an array is : " + max_output);

        int min_output = give_min(a1);
        System.out.println("Maximum number from an array is : " + min_output);
    }

    static int give_max(int[] a1) {
// Assume first one is max
        int max1 = a1[0]; //51

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] > max1) {
                max1 = a1[i]; // if found max then replace with max1
            }
        }
        return max1;
    }

    //min function

    static int give_min(int[] a1) {
// Assume first one is max
        int min1 = a1[0]; //51

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] < min1) {
                min1 = a1[i]; // if found max then replace with max1
            }
        }
        return min1;
    }
}



