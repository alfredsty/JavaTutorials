package CliApp.myTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] JJ = { "정보시스템" , "프로그래밍 활용" , "데이터베이스 활용" };
        int[] SCORE = new int[3];
        Scanner scn = new Scanner(System.in);
        System.out.println("이름이 무엇인가요?");
        String name = scn.next();
        for(int i = 0; i<SCORE.length; i++){
            System.out.println(JJ[i] +" 점수를 입력하세요.");
            SCORE[i] = scn.nextInt();
        }
        int total = 0;
        for(int i = 0; i <SCORE[i]; i++) {
            total += SCORE[i];
        }
        double avg = (double)total / SCORE.length;

        boolean isPass = false;
        if(avg >= 60){
            isPass = true;
            for(int i = 0; i<SCORE.length; i++){
                if(SCORE[i] <40){
                    isPass = false;
                }
            }
        }
    }
}
