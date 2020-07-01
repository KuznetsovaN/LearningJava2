package Lesson8;

/**
 * Класс Калькулятор
 * Объект хранит значения двух дробных чисел и осуществляет операции над ними
 */

public class Calc {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    private static double firstNumber;
    private static double secondNumber;
    /**
     * * Атрибуты класса:
     * Дробное число firstNumber - первое число для операции
     * Дробное число secondNumber - второе число для операции
     */

    //private double firstNumber;
    //private double secondNumber;

    /**
     * Конструктор с заданными параметрами
     *
     * @param firstNumber Первое дробное число
     * @param secondNumber Второе дробное число
     */

    public Calc(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    /**
     * Геттер для первого числа
     * @return Возвращает значение первого числа данного объекта
     */

    public static double getFirstNumber() {
        return firstNumber;
    }

    /**
     * Сеттер для первого числа
     * @param firstNumber Дробное число
     */

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    /**
     * Геттер для второго числа
     * @return Возвращает значение второго числа данного объекта
     */

    public static double getSecondNumber() {
        return secondNumber;
    }

    /**
     * Сеттер для второго числа
     * @param secondNumber Дробное число
     */

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    /**
     * Метод для сложения двух чисел, хранящихся в текущем объекте
     * @return Результат сложения двух чисел
     * */

    public static double plus(double a, double b ) {
        return a + b;
    }

    /**
     * Метод для вычитания двух чисел, хранящихся в текущем объекте
     * @return Результат вычитания двух чисел
     */

    public static double minus(double a, double b) {
        return a-b;
    }

    /**
     * Метод для умножения двух чисел, хранящихся в текущем объекте
     * @return Результат умножения двух чисел
     */

    public static double umn(double a, double b) {
        return a*b;
    }

    /**
     * Метод для деления двух чисел, хранящихся в текущем объекте
     * @return Результат деления двух чисел
     */

/**
    public static double del(double a, double b) {

        //При выполнение деления на 0 появляется предупреждение
        if (b == 0) {
            throw new ArithmeticException(ANSI_RED + "На ноль делить нельзя!" + ANSI_RESET);
        }

        return a/b;
    } */

public static double del(double a, double b)
{  return a/b;}


}
