/**Задание №2

        1. Начинаем писать калькулятор:

        Реализовать сложение дробных чисел, которые пользователь вводит в консоль. Использовать комментарии и JavaDoc при описании метода.
 Использовать форматирование при выводе результата в консоль. Полученный результат округлять до 4-х знаков после запятой.

        2. Запушить проект в свой репозиторий на GitHub

        *Добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)*/
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите первое значение:");
        double num_1 = enter.nextDouble();
        Scanner enter_2 = new Scanner(System.in);
        System.out.println("Введите второе значение:");
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
        }
    }
}