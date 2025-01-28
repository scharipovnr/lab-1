import java.util.Objects;

public class House extends Structure {
    // Поля класса
    private int numberOfFloors;
    private String houseType;

    // Конструктор по умолчанию
    public House() {
        super();
        this.numberOfFloors = 0;
        this.houseType = "";
    }

    // Конструктор с параметрами
    public House(double area, String address, int numberOfFloors, String houseType) {
        super(area, address);
        setNumberOfFloors(numberOfFloors); // Используем setter для проверки значений
        this.houseType = houseType;
    }

    // Getter для поля numberOfFloors
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    // Setter для поля numberOfFloors с проверкой на отрицательное значение
    public void setNumberOfFloors(int numberOfFloors) {
        if (numberOfFloors < 0) {
            throw new IllegalArgumentException("Number of floors must be non-negative.");
        }
        this.numberOfFloors = numberOfFloors;
    }

    // Getter для поля houseType
    public String getHouseType() {
        return houseType;
    }

    // Setter для поля houseType
    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    // Переопределение метода equals для сравнения объектов
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false; // Проверка базового класса
        House house = (House) obj;
        return numberOfFloors == house.numberOfFloors && houseType.equals(house.houseType);
    }

    // Переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfFloors, houseType);
    }

    // Переопределение метода toString для представления объекта в виде строки
    @Override
    public String toString() {
        return "House{" +
                "numberOfFloors=" + numberOfFloors +
                ", houseType='" + houseType + '\'' +
                ", area=" + area +
                ", address='" + address + '\'' +
                '}';
    }
}
