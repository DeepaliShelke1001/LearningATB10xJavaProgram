package ex_16_Arrays;

public class Lab150_Arrays_InterviewQAns_Sum_Of_Array {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];
        }
        System.out.println(sum); //15
    }
}
