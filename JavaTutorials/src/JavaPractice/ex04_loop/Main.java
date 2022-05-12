package JavaPractice.ex04_loop;

public class Main {
    public static void main(String[] args) {

        for(int i  =0; i<7; i= i+1){
            System.out.println("반복문");
        }

        int a = 5;
        while(a<10){
            System.out.println("while문");
            a++;
        }

        int b =1;
        while(b<=10){
            b++;

            if(b == 3){

                continue;
            }
            System.out.println("B="+b);
        }

    }
}
