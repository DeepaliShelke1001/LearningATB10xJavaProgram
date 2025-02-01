package ex_10_For_Loop;

public class Lab113_For_Loop_break {

    public static void main(String[] args) {

        for (int a = 0; a < 50; a++) {
            if (a == 5) {
                break;
            }
            System.out.println("Deepali");
        }
    }
}
// here output will be

//a | a++ | condition (a<50) | if (a == 5) |result
//0 | 1 | true | false | Deepali
//1 | 2 | true | false | Deepali
//2 | 3 | true | false | Deepali
//3 | 4 | true | false | Deepali
//4 | 5 | true | false | Deepali
//5 | 6 | true | true | NA  ==> here output will break
//
//Deepali
//Deepali
//Deepali
//Deepali
//Deepali
