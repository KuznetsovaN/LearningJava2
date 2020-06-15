/**Задание №5:

 Реализовать калькулятор в стиле ООП. Архитектуру приложения продумать самостоятельно.
 */

package Lesson5;
import java.util.Scanner;

public class Task5 {
    double number_1;
    double number_2;
    double number_3;
    public static void main(String[] args){
        Task5 x = new Task5();

        Scanner enter = new Scanner(System.in);
        System.out.println("Первое значение");
        x.number_1 = enter.nextDouble();
        Scanner enter_2 = new Scanner(System.in);
        System.out.println("Второе значение");
        x.number_2 = enter.nextDouble();
        x.number_3 = 0;
        String choose = new String();
        System.out.println("Символ математическоей операции");
        choose = enter_2.nextLine();
        if (choose.equals("+")) {
            x.number_3 = x.number_1 + x.number_2;
            System.out.printf("%.4f",x.number_3);
        } else if (choose.equals("-")) {
            x.number_3 = x.number_1 - x.number_2;
            System.out.printf("%.4f",x.number_3);
        } else if (choose.equals("*")) {
            x.number_3 = x.number_1 * x.number_2;
            System.out.printf("%.4f",x.number_3);
        } else if (choose.equals("/")) {
            x.number_3 = x.number_1 / x.number_2;
            System.out.printf("%.4f",x.number_3);
        } else {
            System.out.println("Ошибка!");
        }
    }
}

