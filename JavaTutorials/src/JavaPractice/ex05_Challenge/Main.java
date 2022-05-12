package JavaPractice.ex05_Challenge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("이름이 무엇인가요?");
        String 이름 = scn.next();
        System.out.println(이름+"님, 안녕하세요");

        System.out.println("시작할까요?");
        System.out.println("\t1.예");
        System.out.println("\t2.아니요");
        int 시작체크 = scn.nextInt();

        while(시작체크 != 1)
        {
            System.out.println("시작할까요?");
            System.out.println("\t1.예");
            System.out.println("\t2.아니요");

            시작체크 = scn.nextInt();
        }

        Random rnd = new Random();
        int x = rnd.nextInt(100) +1;
        System.out.println("숫자 하나를 선택하세요 :");
        int 입력수 = scn.nextInt();

        int 시도횟수 = 0;
        boolean 맞춤체크 = false;
        boolean 끝체크 = false;

        while(!끝체크){
            시도횟수++;

            if(시도횟수 <= 20){
                if(입력수 <= x){
                    맞춤체크 = true;
                    끝체크 = true;
                }else if(입력수 > x){
                    System.out.println("더 낮은 수를 입력하세요!");
                    입력수 = scn.nextInt();
                }else if(입력수 < x){
                    System.out.println("더 높은 수를 입력하세요!");
                    입력수 = scn.nextInt();
                }
            } else{
                끝체크 = true;
            }

            if(맞춤체크){
                System.out.println("축하합니다~! "+시도횟수+"번 만에 맞췄네요!");
            }
            else {
                System.out.println("정답은 "+x+"였습니다...");
            }
        }

    }
}
