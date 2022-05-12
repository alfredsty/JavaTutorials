package JavaPractice.ex09_oop3;

public class EletricCar implements CarInterface{
    String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public void Boot() {
        System.out.println("[전기차]"+this.getName()+"시동걸었어요." );
    }

    public EletricCar(String name) {
        Name = name;
    }

    @Override
    public void Move(int Speed) {
        System.out.println("[전기차]"+Speed+"km/로 이동합니다.");
    }
}
