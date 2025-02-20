package ex_18_OOPS_constructor;

public class Lab162_OOPS {
    public static void main(String[] args) {

        Baby b1 = new Baby();
       new Baby();
       new Baby();
       new Baby();

    }
}


class Baby{

    String name;

    // Default Constructor also called
    Baby(){
        System.out.println("I am called, Object is created!");
    }

    // Instance initialization block
    {
        System.out.println("Step 1 - Called Database before working!!");

    }


}