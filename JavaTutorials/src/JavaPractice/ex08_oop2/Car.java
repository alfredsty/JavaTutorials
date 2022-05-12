package JavaPractice.ex08_oop2;

public class Car {
    private String Name;
    private int Door;
    private String Color;
    private Engine engine;

    public Car(String name, int door, String color, Engine engine) {
        this.Name = name;
        this.Door = door;
        this.Color = color;
        this.engine = engine;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDoor() {
        return Door;
    }

    public void setDoor(int door) {
        Door = door;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override // 멤버 함수 재정의
    public String toString() {
        return "Car{" +
                "Name='" + Name + '\'' +
                ", Door=" + Door +
                ", Color='" + Color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
