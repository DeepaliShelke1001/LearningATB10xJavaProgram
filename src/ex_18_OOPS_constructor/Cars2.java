package ex_18_OOPS_constructor;

public class Cars2 {

String model;
int year;

//Default constructor
Cars2(){
    model = "Telsa";
    year = 2025;
    System.out.println("DC");
}

//Para constructor
Cars2(String model_name, int year1){
    this.model =model_name;
    this.year = year1;
}

}


