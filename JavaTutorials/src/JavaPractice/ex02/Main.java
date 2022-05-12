package JavaPractice.ex02;

public class Main {
    public static void main(String[] args) {
        int a = 6;
        int b  =5;
        int ab1 = a+b; // 덧셈
        int ab2 = a-b; // 뺄셈
        int ab3 = a*b; // 곱셈
        int ab4 = a/b; // 나눗셈의 몫
        int ab5 = a%b; // 나눗셈의 나머지
        System.out.println(ab1);
        System.out.println(ab2);
        System.out.println(ab3);
        System.out.println(ab4);
        System.out.println(ab5);

        // int 끼리 연산해서 double 이 나올 수가 없다
        // 강제 형변환을 해줘야 된다.

        double ans = (double) a / (double) b;
        System.out.println(ans);

        int c = 5;
        c = 3;
        System.out.println(c++);
        c =  c + 1;
        System.out.println(++c);

        int d = 6;
        d = d+7;
        d += 7;
        d = d *2;
        d *= 2;
        d /= 2;

        boolean bA = true;
        boolean bB = false;
        boolean bC = false;

        boolean bAB1 = bA && bB && bC; // AND 연산 : 모두 참일 떄만 결과가 참이다.
        System.out.println(bAB1);
        boolean bAB2 = bA || bB || bC; //OR 연산 : 하나라도 참이면 결과는 참이다.
        System.out.println(bAB2);



    }
}
