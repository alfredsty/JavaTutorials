package JavaPractice.ex09_oop3;

public class InternalCombustion implements CarInterface{
    String Name;

    public InternalCombustion(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public void Boot() {
        System.out.println("[내연기관]"+this.getName()+"시동걸었어요." );
    }

    @Override
    public void Move(int Speed) {
        System.out.println("[내연기관차]"+Speed+"km/로 이동합니다.");
    }
}
