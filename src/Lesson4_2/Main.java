package Lesson4_2;
/**
 * Main класс
 * Формирование новогоднего подарка из списка доступных сладостей
 */

public class Main {
    /**
     * Класс Podarok
     * Описывает тип: Новогодний подарок.
     */
    public static void main(String[] args) {

        Drops DropsLimon = new Drops("Лимонные", 15 ,20, "жёлтый");
        Drops DropsSulfur = new Drops("Со вкусом яблока", 15 ,25, "Зеленый");
        Drops DropsStrawberry = new Drops("Клубничные", 15 ,15, "Розовый");
        Drops DropsCopper = new Drops("Со вкусом мёда", 15 ,35, "Бронзовый");

        Chocolate ChocolateWhite = new Chocolate("Из белого шоколада", 25, 22, "AlpenGold");
        Chocolate ChocolateBroun = new Chocolate("Из молочного шоколада", 25, 20, "Аленка");
        Chocolate ChocolateBlack = new Chocolate("Из темного шоколада", 25, 28, "Вдохновение");

        Waffles WafflesPistache = new Waffles("Вкусвилл", 200, 42, "Кокосовое");
        Waffles WafflesVanilla = new Waffles("Красный октябрь", 120, 17, "Ванильное");
        Waffles WafflesCoffee = new Waffles("Заморское", 80, 33, "Кофейное");

        Candy[] box = {DropsLimon, DropsSulfur, DropsStrawberry, DropsCopper, ChocolateWhite, ChocolateBroun,

                ChocolateBlack, WafflesPistache, WafflesVanilla, WafflesCoffee};

        Podarok prsnt = new Podarok(0, 0);
        prsnt.makePodarok(box);
        prsnt.printPodarok();
    }
}