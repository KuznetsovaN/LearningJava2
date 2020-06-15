/**2. Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр.
 * Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.*
*/
package Lesson4;

import java.util.List;
import java.util.ArrayList;

public class Task4_2 {
    private String name;
    private int weight;
    private Double price;

    public static void main(String[] args){

        try {
            List<Podarok> podarki = new ArrayList<Podarok>();
            podarki.add(new Podarok("Аленка", 900, 300.1));
            podarki.add(new Podarok("Ириска", 510, 220.0));
            podarki.add(new Podarok("Барбарис", 200, 100.0));

            int total_weight = 0;
            double total_cost = 0.0;
            for (Podarok temp : podarki) {
                System.out.println(temp);
                total_weight += temp.getWeight();
                total_cost += temp.getPrice();
            }
            System.out.println("Общий вес: " + total_weight + " г.");
            System.out.println("Общая стоимость: " + total_cost + " руб.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Podarok {
    private String name;
    private int weight;
    private Double price;

    public Podarok(){}

    public Podarok(String name, int weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }
    public Double getPrice(){
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "Товар: название - '"+name+"', вес - "+weight+" г, цена - "+price+" руб.";
    }
}