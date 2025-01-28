import java.util.Objects;

public class Structure {
    // Поля класса
    protected double area;
    protected String address;

    // Конструктор по умолчанию
    public Structure() {
        this.area = 0.0;
        this.address = "";
    }

    // Конструктор с параметрами
    public Structure(double area, String address) {
        setArea(area); // Используем setter для проверки значений
        this.address = address;
    }

    // Getter для поля area
    public double getArea() {
        return area;
    }

    // Setter для поля area с проверкой на отрицательное значение
    public void setArea(double area) {
        if (area < 0) {
            throw new IllegalArgumentException("Area must be non-negative.");
        }
        this.area = area;
    }

    // Getter для поля address
    public String getAddress() {
        return address;
    }

    // Setter для поля address
    public void setAddress(String address) {
        this.address = address;
    }

    // Переопределение метода equals для сравнения объектов
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Проверка на идентичность объектов
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и совпадение классов
        Structure that = (Structure) obj;
        return Double.compare(that.area, area) == 0 && address.equals(that.address);
    }

    // Переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(area, address);
    }

    // Переопределение метода toString для представления объекта в виде строки
    @Override
    public String toString() {
        return "Structure{" +
                "area=" + area +
                ", address='" + address + '\'' +
                '}';
    }
}
