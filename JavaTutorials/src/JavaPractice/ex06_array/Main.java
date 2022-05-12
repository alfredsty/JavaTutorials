package JavaPractice.ex06_array;

public class Main {
    public static void main(String[] args) {
        String[] 학생 = new String[5];
        학생[0] = "로제";
        학생[1] = "제니";
        학생[2] = "리사";
        학생[3] = "지수";

        int[] 학번 = {123,456,789,135};
        for(String s : 학생){
            System.out.println(s);
        }
        String x = "지수";
        for(int i = 0; i<학생.length; i++){
            if(x.equals(학생[i])) {
                System.out.println(x + "의 학번은" + 학번[i] + "입니다.");
            }
        }
    }
}
