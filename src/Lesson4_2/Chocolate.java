package Lesson4_2;

/**
 * Класс Chocolate
 * Описывает продукт типа "Шоколад"
 * @see Candy
 */

public class Chocolate extends Candy {
    private String mageName;

    public Chocolate(String name, int weight, int price, String mageName) {
        super(name, weight, price);
        this.mageName = mageName;
    }

    public String getMageName() {
        return mageName;
    }

    public void setMageName(String mageName) {
        this.mageName = mageName;
    }

    @Override
    public String toString() {
        return "Шоколад: " + super.toString() + ", Открытка с: " + mageName;
    }
}

