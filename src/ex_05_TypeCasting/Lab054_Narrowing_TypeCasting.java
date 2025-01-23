package ex_05_TypeCasting;

public class Lab054_Narrowing_TypeCasting {

    public static void main(String[] args) {

        int val  = 200;
        // byte b = val; // // Invalid - Implicit Casting narrowing is not allowed
        byte b = (byte)val; // // // Valid -> Explicit Casting -  allowed
        // Bigger value storing into the lower value so it will be overflow so there will be a Data Loss


    }
}
