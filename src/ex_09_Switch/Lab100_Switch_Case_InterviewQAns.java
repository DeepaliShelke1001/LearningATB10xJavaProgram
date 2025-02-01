package ex_09_Switch;


public class Lab100_Switch_Case_InterviewQAns {
    public static void main(String[] args) {

        // lambda expression means you can add without a break. -> means break. break is added, you dont see there but it is added.

        char code = 'C';

        switch(code){
            default:
                System.out.println("Hellooooo");
                break;
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
        } // output is Hellooooo because no matching case for Cso it will take default case

    }
}
