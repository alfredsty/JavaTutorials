package JavaPractice.ex07_oop;

public class Android {
    String 모델버전;
    int 스크린크기;
    int 메모리;
    int 카메라화소수;
    int 색상;

    public Android(String 모델버전, int 스크린크기, int 메모리, int 카메라화소수, int 색상) {
        this.모델버전 = 모델버전;
        this.스크린크기 = 스크린크기;
        this.메모리 = 메모리;
        this.카메라화소수 = 카메라화소수;
        this.색상 = 색상;
    }
    public void 음악듣기(String 제목){
        System.out.println("Play:"+ 제목 + "");
    }
}
