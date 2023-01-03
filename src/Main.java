public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        char clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке ниже");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке ниже ");
        }

        System.out.println("Task 2");
        char clientOS2 = 1;
        int clientDeviceYear = 2015;
        int year = 2020;
        if (clientOS2 == 1 && year <= clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке ниже");
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS2 == 1 && year > clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке ниже");
        } else if (clientOS2 == 0 && year <= clientDeviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке ниже");
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке ниже");
    }
}
}