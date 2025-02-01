package ex_09_Switch;


public class Lab99_switch_Lambda_Expression {
    public static void main(String[] args) {

        // lambda expression means you can add without a break. -> means break. break is added, you dont see there but it is added.

        int itemcode = 001;

        switch (itemcode) {

            case 001->System.out.println("001");
            case 002->System.out.println("002");
            case 003->System.out.println("003");
            default->System.out.println("invalid");
        }

    }
}
