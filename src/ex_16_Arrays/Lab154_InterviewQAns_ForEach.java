package ex_16_Arrays;

public class Lab154_InterviewQAns_ForEach {
    public static void main(String[] args) {

        int[] a3 = new int[3];
        a3[0] = 90;
        a3[1] = 80;
        a3[2] = 8;

//        for(int  i = 0; i< a3.length; i++){
//            System.out.println(a3[i]);
//        }
//
        for (int i : a3) {
            System.out.println(i);
        }

        String[] names = {"Deepa", "Deep", "Neha"};
        for (String s : names) {
            System.out.println(s);
        }

    }
}
