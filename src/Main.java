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
        int yearDev = 2020;
        if (clientOS2 == 1 && yearDev <= clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке ниже");
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS2 == 1 && yearDev > clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке ниже");
        } else if (clientOS2 == 0 && yearDev <= clientDeviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке ниже");
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке ниже");
        }

        System.out.println("Task 3");
        int year = 2200;
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Год " + year + " является високосным");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Год " + year + " является високосным");
        } else if (year % 100 == 0) {
            System.out.println("Год " + year + " не является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }

        System.out.println("Task 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Доставка займет сутки");
        } else if (deliveryDistance < 60) {
            System.out.println("Доставка займет двое суток");
        } else if (deliveryDistance < 100) {
            System.out.println("Доставка займет трое суток");
        } else {
            System.out.println("Доставка в вашу зону не осущетствляется");
        }
    }
}