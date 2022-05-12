package JavaPractice.ex03;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        if(a > 3){
            System.out.println("a는 3보다 큰 수 입니다.");
        }
        else {
            System.out.println("a는 3보다 큰 수가 아닙니다.");
        }

        if(a > 0){
            System.out.println("양수");
        } else if (a < 0) {
            System.out.println("음수");
        }
        else{
            System.out.println("제로");
        }
        switch (a){
            case 1 : case 4:
                break;
            case 2: case 5:
                break;
            case 3: case 6:
                break;
            default:

        }
    }
}
