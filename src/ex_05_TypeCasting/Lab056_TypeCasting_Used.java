package ex_05_TypeCasting;

public class Lab056_TypeCasting_Used {

    public static void main(String[] args) {

       // GST - 18.45
        int course_fee = 100;
        float GST = 18.45f;
        float total = course_fee + GST;// widening implicit happens automatically here
        
        System.out.println(total); //118.45

        // int total = course_fee + GST; // // this is not possible because value in float but if we want to
        // convert into int then convert GST into int so use casting

        //But if we are using narrowing then we will loss .45 everytime

        int total1 = course_fee + (int) GST;
        System.out.println(total1); // 118  // data loss


    }
}
