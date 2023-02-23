public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        byte age = 15;
        if (age >= 18) {
            System.out.println("Человеку 18 или больше лет");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил и нужно немного подождать");
        }
        ;
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        byte temperature = -15;
        if (temperature >= -5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        byte speed = 80;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        byte age = 25;
        boolean preschooler = (age >= 2 && age <= 6);
        boolean schoolboy = (age >= 7 && age <= 18);
        boolean student = (age > 18 && age <= 24);
        boolean worker = (age > 24);
        if (preschooler) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else {
            if (schoolboy) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            } else {
                if (student) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
                } else {
                    if (worker) {
                        System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
                    } else {
                        System.out.println("Если возраст человека равен " + age + ", то возраст введен некорректно");
                    }
                }
            }
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        byte age = 5;
 if(age < 5){System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе");
 }else {if(age >=5&&age<14){System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
 }else {if(age>=14){System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого");
 }
 }
 }

    }
}