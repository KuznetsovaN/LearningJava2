/**3. Программа должна выполнять одно из заданий на выбор.
 Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве. */

package Lesson3;
import java.util.Scanner;

import static Lesson2.Task2.calculator;
import static Lesson3.Task3_2.max_element_array;

public class Task3_3 {

    public static void main(String[] args) {
        Task3_2 object = new Task3_2();
        System.out.println("Введите код действия: 1-калькулятор, 2-Поиск самой длинной строки");
        Scanner enter = new Scanner(System.in);
        int choose = enter.nextInt();


        switch (choose) {

            case 1: calculator();
                break;
            case 2: max_element_array();
                break;

        }

    }
}