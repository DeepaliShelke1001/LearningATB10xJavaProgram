package Java_Programs;

import java.util.Arrays;

public class Task3_9Feb_Left_Side_Triangle_PatternStar {
    public static void main(String[] args) {

//✅ Left Triangle Star Pattern
//
//*****
//
//****
//
//***
//
//**
//
//*

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4 - i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }


    }
}
