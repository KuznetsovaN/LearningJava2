package Lesson4_2;
/**
 * Класс Waffles
 * Описывает продукт "Вафля"
 * @see Candy
 */

public class Waffles extends Candy {
    private String taste;

    public Waffles(String name, int weight, int price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Мороженое: " + super.toString() + ", Вкус: " + taste;
    }
}

