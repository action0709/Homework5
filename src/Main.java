public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        byte age = 15;
        if (age >= 18) {
            System.out.println("Человеку 18 или больше лет");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил и нужно немного подождать");
        } ;
    }

     public static void task2 () {
         System.out.println("Задача 2");
         // Пишем код для задачи 2
         byte temperature = -15;
         if (temperature>= -5) {
             System.out.println("Сегодня тепло, можно идти без шапки");
         } else {
             System.out.println("На улице холодно, нужно надеть шапку");
         }
     }
    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        byte speed = 80;
        if (speed>= 60) {
            System.out.println("Если скорость "+speed+", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость "+speed+", то можно ездить спокойно");
        }
    }
}