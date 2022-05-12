package JavaPractice.ex07_oop;

public class IPhone {
    private String 모델버전;
    private int 스크린크기;
    private int 메모리;
    private int 카메라화소수;
    private int 색상;

    public void 음악듣기(String 제목)
    {
        System.out.println("아이폰Play:"+ 제목 );
    }

    public String get모델버전() {
        return 모델버전;
    }

    public void set모델버전(String 모델버전) {
        this.모델버전 = 모델버전;
    }

    public int get스크린크기() {
        return 스크린크기;
    }

    public void set스크린크기(int 스크린크기) {
        this.스크린크기 = 스크린크기;
    }

    public int get메모리() {
        return 메모리;
    }

    public void set메모리(int 메모리) {
        this.메모리 = 메모리;
    }

    public int get카메라화소수() {
        return 카메라화소수;
    }

    public void set카메라화소수(int 카메라화소수) {
        this.카메라화소수 = 카메라화소수;
    }

    public int get색상() {
        return 색상;
    }

    public void set색상(int 색상) {
        this.색상 = 색상;
    }

    public void 모델버전세팅(String a)
    {
        모델버전 = a;
    }
    public void 스크린크기세팅(int a){
        스크린크기 = a;
    }
}
