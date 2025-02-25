package ex_19_OOPS_Part2;

public class Lab166_Parameter_Constructor {
    public static void main(String[] args) {
        Mobile iphone = new Mobile("iphone", "2008");
        Mobile oneplus = new Mobile("One Plus", "2015");
        Mobile samsung = new Mobile("Ultra 25 AI", "2025");
        System.out.println(iphone.model_name);
        System.out.println(oneplus.model_name);
        System.out.println(samsung.model_name);
        System.out.println(samsung.year_of_launch);
        System.out.println(iphone.year_of_launch);

        //function call
        samsung.display();
        String model_name_main = samsung.give_me_model_name();
        System.out.println(model_name_main);
    }
}

class Mobile {
    String model_name;
    String year_of_launch;

    //Parameterised constructor
    Mobile(String model_name_c, String year_of_launch_c) {
        this.model_name = model_name_c;
        this.year_of_launch = year_of_launch_c;
    }

    //function without return
    void display() {
        System.out.println(this.model_name + " - " + this.year_of_launch);
    }

    //function with return
    String give_me_model_name() {
        return this.model_name;
    }
}