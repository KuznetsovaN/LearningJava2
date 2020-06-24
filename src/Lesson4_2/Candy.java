package Lesson4_2;
/**
 * Абстрактный класс Конфеты
 * Содержит наименование, вес и цену продукта, а также абстрактный метод вывода информации о продукте
 */

public class Candy {
    private String name;
    private int weight;
    private int price;

    public Candy(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Наименование: " + name + ", Вес = " + weight + ", Цена = " + price;
    }
}