import java.util.Objects;

public class Apartment extends Structure {
    // Поля класса
    private int apartmentNumber;
    private String apartmentType;

    // Конструктор по умолчанию
    public Apartment() {
        super();
        this.apartmentNumber = 0;
        this.apartmentType = "";
    }

    // Конструктор с параметрами
    public Apartment(double area, String address, int apartmentNumber, String apartmentType) {
        super(area, address);
        setApartmentNumber(apartmentNumber); // Используем setter для проверки значений
        this.apartmentType = apartmentType;
    }

    // Getter для поля apartmentNumber
    public int getApartmentNumber() {
        return apartmentNumber;
    }

    // Setter для поля apartmentNumber с проверкой на отрицательное значение
    public void setApartmentNumber(int apartmentNumber) {
        if (apartmentNumber < 0) {
            throw new IllegalArgumentException("Apartment number must be non-negative.");
        }
        this.apartmentNumber = apartmentNumber;
    }

    // Getter для поля apartmentType
    public String getApartmentType() {
        return apartmentType;
    }

    // Setter для поля apartmentType
    public void setApartmentType(String apartmentType) {
        this.apartmentType = apartmentType;
    }

    // Переопределение метода equals для сравнения объектов
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false; // Проверка базового класса
        Apartment apartment = (Apartment) obj;
        return apartmentNumber == apartment.apartmentNumber && apartmentType.equals(apartment.apartmentType);
    }

    // Переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), apartmentNumber, apartmentType);
    }

    // Переопределение метода toString для представления объекта в виде строки
    @Override
    public String toString() {
        return "Apartment{" +
                "apartmentNumber=" + apartmentNumber +
                ", apartmentType='" + apartmentType + '\'' +
                ", area=" + area +
                ", address='" + address + '\'' +
                '}';
    }
}
