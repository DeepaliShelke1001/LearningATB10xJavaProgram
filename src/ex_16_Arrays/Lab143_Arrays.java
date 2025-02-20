package ex_16_Arrays;

public class Lab143_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int[] marks = {91, 51, 100, 54}; //Array creation  with the pre defined elements

        System.out.println(marks.length);// length always starts from 1. so 4
        System.out.println(marks[0]);//91
        System.out.println(marks[5]);//ArrayIndexOutOfBoundsException
    }
}
