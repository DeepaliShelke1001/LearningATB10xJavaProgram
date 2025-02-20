package ex_16_Arrays;

public class Lab144_Arrays {
    public static void main(String[] args) {

        int[] marks = {1, 2, 3, 4, 5, 6};
        //2nd type using new operator

        int[] marks1 = new int[5]; //fixed size.
        System.out.println(marks1.length);//5

        //change the value of marks1 2's
        marks1[2] = 91;
        System.out.println(marks1[0]);//91
    }
}
