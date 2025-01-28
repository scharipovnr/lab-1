import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Коллекция для хранения объектов типа Structure
    private static ArrayList<Structure> structures = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Бесконечный цикл для меню
        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Добавить новый элемент");
            System.out.println("2. Удалить элемент по индексу");
            System.out.println("3. Вывод всех элементов");
            System.out.println("4. Сравнение двух элементов на равенство (по индексам)");
            System.out.println("5. Завершение работы приложения");

            // Получение выбора пользователя
            int choice = scanner.nextInt();
            scanner.nextLine();

            // Обработка выбора пользователя
            switch (choice) {
                case 1:
                    addNewElement();
                    break;
                case 2:
                    deleteElementByIndex();
                    break;
                case 3:
                    displayAllElements();
                    break;
                case 4:
                    compareElements();
                    break;
                case 5:
                    System.out.println("Завершение работы...");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    // Метод для добавления нового элемента
    private static void addNewElement() {
        System.out.println("Выберите тип элемента:");
        System.out.println("1. Дом");
        System.out.println("2. Гараж");
        System.out.println("3. Квартира");

        int typeChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите площадь:");
        double area = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Введите адрес:");
        String address = scanner.nextLine();

        // В зависимости от выбранного типа элемента, создаем объект и добавляем его в коллекцию
        switch (typeChoice) {
            case 1:
                System.out.println("Введите количество этажей:");
                int numberOfFloors = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Введите тип дома:");
                String houseType = scanner.nextLine();

                structures.add(new House(area, address, numberOfFloors, houseType));
                break;
            case 2:
                System.out.println("Введите количество машиномест:");
                int numberOfSpaces = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Введите тип гаража:");
                String garageType = scanner.nextLine();

                structures.add(new Garage(area, address, numberOfSpaces, garageType));
                break;
            case 3:
                System.out.println("Введите номер квартиры:");
                int apartmentNumber = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Введите тип квартиры:");
                String apartmentType = scanner.nextLine();

                structures.add(new Apartment(area, address, apartmentNumber, apartmentType));
                break;
            default:
                System.out.println("Неверный выбор типа элемента.");
        }
    }

    // Метод для удаления элемента по индексу
    private static void deleteElementByIndex() {
        System.out.println("Введите индекс элемента для удаления:");
        int index = scanner.nextInt();

        if (index >= 0 && index < structures.size()) {
            structures.remove(index);
            System.out.println("Элемент удален.");
        } else {
            System.out.println("Неверный индекс.");
        }
    }

    // Метод для вывода всех элементов коллекции
    private static void displayAllElements() {
        if (structures.isEmpty()) {
            System.out.println("Коллекция пуста.");
        } else {
            for (int i = 0; i < structures.size(); i++) {
                System.out.println(i + ": " + structures.get(i));
            }
        }
    }

    // Метод для сравнения двух элементов по индексам
    private static void compareElements() {
        System.out.println("Введите индекс первого элемента:");
        int index1 = scanner.nextInt();

        System.out.println("Введите индекс второго элемента:");
        int index2 = scanner.nextInt();

        if (index1 >= 0 && index1 < structures.size() && index2 >= 0 && index2 < structures.size()) {
            if (structures.get(index1).equals(structures.get(index2))) {
                System.out.println("Элементы равны.");
            } else {
                System.out.println("Элементы не равны.");
            }
        } else {
            System.out.println("Неверный индекс.");
        }
    }
}
