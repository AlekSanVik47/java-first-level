package homework.hw1;

public class TasksLesson1 {
    /*
    Создать переменные всех пройденных типов данных, и инициализировать их значения
    */
//    Примитивы
// Целые числа
    byte aByte1 = -128;
    byte aByte2 = 127;
    short aShort = -32768;
    short aShort1 = 32767;
    int anInt = -2147_483_648;
    int anInt1 = 2147_483_647;
    long aLong = -9223_372_036_854_775_808L;
    long aLong1 = 9223_372_036_854_775_807L;
// Дробные числа
    float aFloat = -83_649.999f;
    double aDouble = 75167.358;
//    Литералы
    char aChar = 'V';
//    Логические
 boolean aBoolean = true;
 boolean aBoolean1 = false;

 /* Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – входные параметры этого метода*/
    public static int calculation(int a, int b, int c, int d){
        return a * (b + (c / d));
    }
/*Написать метод, принимающий на вход два числа,
и проверяющий, что их сумма лежит в пределах от 10 до 20(включительно),
если да – вернуть true, в противном случае – false
*/
    public static boolean checkInterval(int num1, int num2){
        int sum = num1 + num2;
        return (sum > 10) && (sum <= 20);
    }

    /*Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль положительное ли число передали, или отрицательное;
    Замечание: ноль считаем положительным числом*/

    public static void positiveOrNegative(int number){
        System.out.printf(number >= 0 ? "Число %s положительное\n" : "Число %s отрицательное\n", number);
    }

    public static boolean checkForNegative (int num){
       return num < 0;
    }
    /*Написать метод, которому в качестве параметра передается строка,
    обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    */
    public static void greetings(String name) {
        System.out.printf("Привет %s!\n", name);
    }
    /*Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный*/

    public static boolean leapYear(int year){
        if ((year % 4 ==0 || year % 400 == 0) && year % 100 !=0) {
            System.out.printf("%dг. - високосный год\n", year);
            return true;
        } else {
            System.out.printf("%dг. - не високосный год\n", year);
            return false;
        }
    }




    public static void main(String[] args) {
        System.out.println(calculation(1527, 25,7, 644));
        System.out.println(checkInterval(15,37));
        System.out.println(checkInterval(5,11));
        positiveOrNegative(-1546);
        System.out.println(checkForNegative(54));
        greetings("Александр");
        leapYear(2020);
        leapYear(2023);
        leapYear(2024);
        leapYear(1600);
    }
}
