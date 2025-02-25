package ex_19_OOPS_Part2.inheritance.singleinheritanceExample;

public class Lab167_Single_Inheritance {
    public static void main(String[] args) {

        Son s1 = new Son();

        //s1.gold_f; // we are using variable of class father to son s1 object and it will gives error.
        //so we need to extend the class

        System.out.println(s1.gold_f); //output is 100
        //When you use extend keyword to inherit  one class to another class. When we extend everything from father class is now is son class

        s1.bhk2();
    }
}

