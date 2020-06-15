/**1. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.
 */


package Lesson4;
import java.util.Random;

public class Task4_1 {
    public static void main(String[] args){
        int length = 20;
        int[] numbers = makeRandomNumbers(length);
        for (int i: numbers) {
            System.out.print(i + " ");
        }
        int indexPositiv = findMinPositiveNumber(numbers);
        int indexNegativ = findMaxNegativeNumber(numbers);
        int temp = numbers[indexNegativ];
        numbers[indexNegativ] = numbers[indexPositiv];
        numbers[indexPositiv] = temp;
        System.out.println("\n");
        for (int i: numbers) {
            System.out.print(i + " ");
        }
    }

    private static int[] makeRandomNumbers(int n){
        int numbers[] = new int[n];
        Random random = new Random();
        for (int i=0; i<n; i++){
            numbers[i] = random.nextInt(21)-10;//Выводит случайное число от 0 до 20, вычитаем 10 - получаем от -10 до +10
        }
        return  numbers;
    }

    //находим максимально отриц. число
    private static int findMaxNegativeNumber(int[] mas){
        int indexOfMaxNegative = 0;

        for(int j=0; j<mas.length; j++) {
            if (mas[j] < 0) {
                indexOfMaxNegative = j;
                break;
            }
        }
        for (int i=0; i<mas.length; i++){
            if(mas[i] < 0 && mas[indexOfMaxNegative]<mas[i]) indexOfMaxNegative = i;
        }
        //System.out.println("отриц:  " +mas[indexOfMaxNegative]);
        return indexOfMaxNegative;
    }

    private static int findMinPositiveNumber(int[] mas){
        int indexOfMinPositive = 0;

        for(int j=0; j<mas.length; j++) {
            if (mas[j] > 0) {
                indexOfMinPositive = j;
                break;
            }
        }
        for (int i=0; i<mas.length; i++){
            if(mas[i] > 0 && mas[indexOfMinPositive]>mas[i]) indexOfMinPositive = i;
        }
       // System.out.println("положительный: " + mas[indexOfMinPositive]);
        return indexOfMinPositive;
    }
}