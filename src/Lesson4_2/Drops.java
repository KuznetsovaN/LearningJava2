package Lesson4_2;
/**
 * Класс Drops
 * Описывает продукт типа "Леденцы"
 * @see Candy
 */

public class Drops extends Candy {
    private String color;

    public Drops(String name, int weight, int price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Леденцы: " + super.toString() + ", Цвет: " + color;
    }
}
