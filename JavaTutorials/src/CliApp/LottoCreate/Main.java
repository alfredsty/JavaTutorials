package CliApp.LottoCreate;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int MAX = 100;
    static int[][] arrayLotto = new int[MAX][6];
    static int idxCurrent = -1;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int menu = -1;
        while(menu != 0){
            printMenu();
            menu = scn.nextInt();
            switch (menu){
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                case 1:
                    makteLotto();
                    break;
                case 2:
                    makteLotto2();
                    break;
                case 3:
                    showLottoList();
                    break;
                default:
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("+------------------------------+");
        System.out.println("|     1.로또 번호 생성(중복 허용)    |");
        System.out.println("|     2.로또 번호 생성(정복 불가)    |");
        System.out.println("|     3.생성된 로또 번호 보기       |");
        System.out.println("|     0.종료                    |");
        System.out.println("+------------------------------+");
        System.out.println(" 메뉴를 선택하세요: ");
    }
    private static void makteLotto(){
        Random rnd = new Random();
        int[] lotto = new int[6];
        for(int i = 0; i <6;i++) {
            int myNumber = rnd.nextInt(45) + 1;
            lotto[i] = myNumber;
        }
        saveLotto(lotto);
    }
    private static void makteLotto2(){
        Random rnd = new Random();
        int[] lotto = new int[6];
        while(true){
            boolean isSame = false;
            for(int i = 0; i<6; i++){//로또번호 생성
                int myNumber = rnd.nextInt(45) +1;
                lotto[i] = myNumber;
            }
            for(int i = 0; i <6; i++){// 중복 체크
                for(int j = 0; j <6; j++){
                    if(i != j){
                        if(lotto[i] == lotto[j]){
                            isSame = true;
                        }
                    }
                }
            }
            // 중복되는게 없으면 while문 나옴
            if(!isSame){ // (isSame == false)  {
                break;
            }
        }
        saveLotto(lotto);
    }

    private static void saveLotto(int[] lotto){
        idxCurrent++;
        if(idxCurrent == MAX){
            System.out.println("저장 범위를 초가했습니다.");
            return;
        }
        for(int i = 0; i<6; i++){
            arrayLotto[idxCurrent][i] = lotto[i];
            System.out.println((i+1)+":"+lotto[i]);
        }
    }
    private static void showLottoList() {
        for(int i =0; i<MAX;i++) {
            System.out.print((i+1)+"번쨰 로또번호");
            for (int j = 0; j<6; j++ ){
                System.out.print(arrayLotto[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
