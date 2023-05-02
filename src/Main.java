public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        int releaseYear = 2014;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (releaseYear >= 2015) {
                System.out.println("становите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (releaseYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        int year = 2021;
        if ((year%4==0)|| (year%400==0) && (year%100!=0)){
            System.out.println(+year+"год является високосным");
        }else {
            System.out.println(+year+"год не является високосным");
        }
        int deliveryDistance = 200;
        if (deliveryDistance<20){
            System.out.println("Доставка в пределах 20 км занимает сутки");
        } else if (deliveryDistance>=20 && deliveryDistance<60){
            System.out.println("потребуется еще один день  + срок доставки ");
        } else if (deliveryDistance>=60 && deliveryDistance<100){
            System.out.println("потребуется еще два дня + срок доставки");
        } else if (deliveryDistance>100){
            System.out.println("Доставки нет");
            
        }
        int monthNumber = 13;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит к сезону лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Месяца не существует");
        }

    }
}