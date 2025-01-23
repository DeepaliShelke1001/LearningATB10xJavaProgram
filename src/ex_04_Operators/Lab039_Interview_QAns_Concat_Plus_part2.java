package ex_04_Operators;

public class Lab039_Interview_QAns_Concat_Plus_part2 {

    public static void main(String[] args) {

        String n1 = "Deepali";
        String n2 = "Shelke";
        int a = 10;
        int b = 10;

        System.out.println(n1+n2+a+b); //DeepaliShelke1010
        //All of them behave same because first operator is of String datatype so it will concate all of them

        System.out.println(a+b+n1+n2); //20DeepaliShelke

        System.out.println(n1+n2+(a+b)); //DeepaliShelke20
        // It will work according to BODMAS rule



    }
}
