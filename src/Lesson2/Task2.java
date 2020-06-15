/**Задание №2

        1. Начинаем писать калькулятор:

        Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
 Использовать комментарии и JavaDoc при описании метода. Использовать форматирование при выводе результата в консоль.
 Полученный результат округлять до 4-х знаков после запятой.

        2. Запушить проект в свой репозиторий на GitHub

        *Добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
 *
 * Задание №3
 *
 *         1. Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания*/


package Lesson2;

import java.util.Scanner;

import static Lesson3.Task3_2.max_element_array;

public class Task2 {

    public static void calculator() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите первое значение");
        double num_1 = enter.nextDouble();
        Scanner enter_2 = new Scanner(System.in);
        System.out.println("Введите второе значение");
        double num_2 = enter.nextDouble();
        double num_3 = 0;
        String choose = new String();
        System.out.println("Введите символ математического действия");
        choose = enter_2.nextLine();
        switch (choose) {

            case "*":
                //умножение
                num_3 = num_1 * num_2;
                System.out.printf("%.4f", num_3);  // выводим результат округляя до 4 знаков после запятой
                break;

            case "/":
                //деление
                num_3 = num_1 / num_2;
                System.out.printf("%.4f", num_3);  // выводим результат округляя до 4 знаков после запятой
                break;

            case "+":
                //сложение
                num_3 = num_1 + num_2;
                System.out.printf("%.4f", num_3);  // выводим результат округляя до 4 знаков после запятой
                break;


            case "-":
                //вычитание
                num_3 = num_1 - num_2;
                System.out.printf("%.4f", num_3);  // выводим результат округляя до 4 знаков после запятой
                break;


            default:
                //любой символ, отличный от +,-,/,*
                System.out.println("Ошибка!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите номер задания 1 калькулятор  или  2 Поиск максимального элемента в массиве");
        Scanner input = new Scanner(System.in);
        String choose_1 = input.nextLine();
        switch (choose_1) {

            case "1":
                calculator(); //задание 2
                break;
            case "2":
                max_element_array(); //задание 3.2
                break;

            default:
                System.out.println("Вы ввели несуществующий номер задания");


        }
    }
}


