package CliApp.bmi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("이름을 입력해주세요.");
        String name = scn.next();
        System.out.print(name + "님 키(cm)를 입력해주세요 : ");
        int height = scn.nextInt();
        System.out.println(name + "님 체중(kg)를 입력해주세요 : ");
        int weight = scn.nextInt();
        double myBmi = (double)weight / Math.pow(height* 0.01,2);
        String msg = "";
        if(myBmi < 20){
            msg = "저체중입니다.";
        }
        else if(myBmi >= 20 && myBmi <= 24){
            msg = "정상입니다.";
        }
        else if(myBmi >= 25 && myBmi <= 29){
            msg = "과체중입니다.";
        }
        else {
            msg = "비만입니다.";
        }
        System.out.printf(
                "%s님의 BMI 수치는 %.2f입니다\n%s"
                ,name, myBmi,msg
        );

    }
}
