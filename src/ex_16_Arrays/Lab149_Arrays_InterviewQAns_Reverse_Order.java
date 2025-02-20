package ex_16_Arrays;

public class Lab149_Arrays_InterviewQAns_Reverse_Order {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        for(int i = numbers.length-1; i>=0; i--){
            System.out.println(numbers[i]);
        }
    }
}
