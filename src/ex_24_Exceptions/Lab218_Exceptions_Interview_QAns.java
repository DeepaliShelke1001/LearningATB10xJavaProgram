package ex_24_Exceptions;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

class Lab218_Exceptions_Interview_QAns {

    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("C://abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

