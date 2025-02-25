package ex_24_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Lab219_Exceptions_Throws {

    public static void main(String[] args) throws FileNotFoundException, Exception {
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
    }
}

