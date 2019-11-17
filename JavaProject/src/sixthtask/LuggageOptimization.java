/**
 * Java. Task 6.
 *
 * Имеется набор вещей, которые необходимо поместить в рюкзак. Рюкзак обладает заданной грузоподъемностью.
 * Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
 * Цель задачи заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.
 *
 * @author Andry Krasikov
 * @version November 17, 2019
 */

package sixthtask;
import java.util.LinkedList;
import java.util.List;

public class LuggageOptimization {
    public static void main(String[] args) {
        List<Item> list = new LinkedList<>();
        list.add(new Item("Тетрадь",   1, 600));
        list.add(new Item("Книга", 2, 5000));
        list.add(new Item("Пенал", 3, 1500));
        list.add(new Item("Зонт", 2, 4000));
        list.add(new Item("Мобильный телефон", 1, 10000));


        Backpack backpack = new Backpack(5);
        backpack.calcBestSet(list);

        list = backpack.getBestSet();


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name + " " + list.get(i).price);
        }

        System.out.println("Total best price is " + backpack.getBestPrice());

        System.out.println("Count: " + backpack.count);
    }
}
