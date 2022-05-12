package JavaPractice.ex09_oop3;

public class Main {
    public static void main(String[] args) {
        InternalCombustion i30 = new InternalCombustion("쌤차");
        EletricCar Tesla = new EletricCar("나의차");
        
        i30.Boot();
        i30.Move(70);

        Tesla.Boot();
        Tesla.Move(100);


    }
}
