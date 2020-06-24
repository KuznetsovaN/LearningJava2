package Lesson5;
import java.util.Scanner;

/**
 * Калькулятор. Выполнение операций над двумя дробными числами.
 * Выбор операции осуществляется из консоли
 * @see CalcOOP
 */

public class Main {
    public static void main(String[] args) {
        //Объявление переменных
        Scanner myValue = new Scanner(System.in);
        int choice;

        //Ввод пользователем двух дробных чисел
        System.out.println("\nВведите первое число:");
        double firstNumber = myValue.nextDouble();
        System.out.println("Введите второе число:");
        double secondNumber = myValue.nextDouble();

        //Создание объекта калькулятора
        CalcOOP myCalculator = new CalcOOP(firstNumber, secondNumber);
        System.out.println();

        //Цикл выбора операции повторяется, пока пользователь не введет команду выхода из модуля
        while (true) {
            //Вывод меню выбора операции
            System.out.println("\nВыберите номер операции ");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. Выход из программы.");

            //Считывание выбора операции
            choice = myValue.nextInt();

            //Выбор операции
            switch (choice) {
                case 1:
                    //При выборе "1" вызывается метод сложения чисел Calculator.plus() и выводится результат
                    System.out.printf("\n%.4f + %.4f = %.4f\n\n",
                            myCalculator.getFirstNumber(), myCalculator.getSecondNumber(), myCalculator.plus());
                    break;
                case 2:
                    //При выборе "2" вызывается метод вычитания чисел Calculator.minus() и выводится результат
                    System.out.printf("\n%.4f + %.4f = %.4f\n\n",
                            myCalculator.getFirstNumber(), myCalculator.getSecondNumber(), myCalculator.minus());
                    break;
                case 3:
                    //При выборе "3" вызывается метод умножения чисел Calculator.umn() и выводится результат
                    System.out.printf("\n%.4f + %.4f = %.4f\n\n",
                            myCalculator.getFirstNumber(), myCalculator.getSecondNumber(), myCalculator.umn());
                    break;
                case 4:
                    //При выборе "4" вызывается метод деления чисел Calculator.del() и выводится результат
                    System.out.printf("\n%.4f + %.4f = %.4f\n\n",
                            myCalculator.getFirstNumber(), myCalculator.getSecondNumber(), myCalculator.del());
                    break;
                case 5:
                    //При выборе "5" происходит выход из модуля
                    System.out.println("\nВыход из программы...\n");
                    return;
                default:
                    //Вывод ошибки при вводе некорректной команды
                    System.out.println("\nТакой операции нет, выберите другую операцию!\n");
            }
        }
    }
}