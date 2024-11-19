public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа");
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();

        System.out.println("Задача 2");
        int clientOS1 = 0;
        int ageOfThePhoneOS = 2015;
        if (clientOS1 == 0 && ageOfThePhoneOS >= 2016) {
            System.out.println("Установите новую версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0 && ageOfThePhoneOS <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS1 == 1 && ageOfThePhoneOS >= 2016) {
            System.out.println("Установите новую версию приложения для Android по ссылке");
        } else if (clientOS1 == 1 && ageOfThePhoneOS <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println();

        System.out.println("Задача 3");
        int year = 1592;
        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
            System.out.println(year + " год не является високосным");
            }
        } else {
        System.out.println("Год не может быть меньше 1585");}

        System.out.println();

        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println();

        System.out.println("Задача 5");
        char monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1 :
            case 2 :
                System.out.println("Это месяц принадлежит к сезону зима");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Это месяц принадлежит к сезону весна");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Это месяц принадлежит к сезону лета");
                break;
            default:
                System.out.println("Это месяц принадлежит к сезону осень");
                break;
        }
    }
}