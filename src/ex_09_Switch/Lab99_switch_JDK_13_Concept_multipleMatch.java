package ex_09_Switch;


public class Lab99_switch_JDK_13_Concept_multipleMatch {
    public static void main(String[] args) {

        // multiple match support in the JDK>13

        int a = 99;

        switch (a) {

            case 1, 2, 3:
                System.out.println("All of the items are Big Basket");
                break;
            case 9, 10:
                System.out.println("All of the items are blink it");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
