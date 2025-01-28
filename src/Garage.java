import java.util.Objects;

public class Garage extends Structure {
    // Поля класса
    private int numberOfSpaces;
    private String garageType;

    // Конструктор по умолчанию
    public Garage() {
        super();
        this.numberOfSpaces = 0;
        this.garageType = "";
    }

    // Конструктор с параметрами
    public Garage(double area, String address, int numberOfSpaces, String garageType) {
        super(area, address);
        setNumberOfSpaces(numberOfSpaces); // Используем setter для проверки значений
        this.garageType = garageType;
    }

    // Getter для поля numberOfSpaces
    public int getNumberOfSpaces() {
        return numberOfSpaces;
    }

    // Setter для поля numberOfSpaces с проверкой на отрицательное значение
    public void setNumberOfSpaces(int numberOfSpaces) {
        if (numberOfSpaces < 0) {
            throw new IllegalArgumentException("Number of spaces must be non-negative.");
        }
        this.numberOfSpaces = numberOfSpaces;
    }

    // Getter для поля garageType
    public String getGarageType() {
        return garageType;
    }

    // Setter для поля garageType
    public void setGarageType(String garageType) {
        this.garageType = garageType;
    }

    // Переопределение метода equals для сравнения объектов
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false; // Проверка базового класса
        Garage garage = (Garage) obj;
        return numberOfSpaces == garage.numberOfSpaces && garageType.equals(garage.garageType);
    }

    // Переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfSpaces, garageType);
    }

    // Переопределение метода toString для представления объекта в виде строки
    @Override
    public String toString() {
        return "Garage{" +
                "numberOfSpaces=" + numberOfSpaces +
                ", garageType='" + garageType + '\'' +
                ", area=" + area +
                ", address='" + address + '\'' +
                '}';
    }
}
