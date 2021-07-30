import java.util.*;

public class RunMyHW {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Яблоко");
        fruits.add("Апельсин");
        fruits.add("Груша");
        fruits.add("Киви");
        fruits.add("Банан");
        System.out.println(fruits);
        fruits.add(0, "Картошка");
        fruits.add((fruits.size() / 2), "Свекла");
        fruits.add("Баклажан");
        System.out.println(fruits);

        ArrayList<String> deleteStrings = new ArrayList<>();
        deleteStrings.add("Январь");
        deleteStrings.add("Февраль");
        deleteStrings.add("Март");
        deleteStrings.add("Апрель");
        deleteStrings.add("Май");
        deleteStrings.add("Июнь");
        deleteStrings.add("Июль");
        deleteStrings.add("Август");
        deleteStrings.add("Сентябрь");
        deleteStrings.add("Октябрь");
        deleteStrings.add("Ноябрь");
        deleteStrings.add("Декабрь");
        System.out.println(deleteStrings);
        deleteStrings.remove(0);
        deleteStrings.remove(deleteStrings.size() / 2 - 1);
        deleteStrings.remove(deleteStrings.size() - 1);
        System.out.println(deleteStrings);
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Белый");
        colors.add("Синий");
        colors.add("Желтый");
        colors.add("Красный");
        colors.add("Зеленый");
        colors.add("Розовый");
        colors.add("Желтый");
        System.out.println(colors.indexOf("Желтый")); //почему не вывелся индекс последний??

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(6);
        numbers.add(10);
        numbers.add(23);
        numbers.add(6);
        numbers.add(12);
        numbers.add(85);
        Integer max = Collections.max(numbers);
        System.out.println("max = " + max);
        Integer min = Collections.min(numbers);
        System.out.println("min = " + min);

        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.reverse(numbers);
        System.out.println(numbers);

        Collections.shuffle(numbers);
        System.out.println(numbers);

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("potato");
        vegetables.add("cucmber");
        vegetables.add("onion");
        vegetables.add("tomato");
        vegetables.add("carrot");
        System.out.println(vegetables);

        int indexPotato = vegetables.indexOf("potato");
        System.out.println(indexPotato);
        vegetables.set(indexPotato, "tomato");
        int indexTomato = vegetables.lastIndexOf("tomato");
        vegetables.set(indexTomato, "potato");
        System.out.println(vegetables);


        ArrayList<String> seasons = new ArrayList<>();
        seasons.add("Зима");
        seasons.add("Лето");
        seasons.add("Весна");

        ArrayList<String> seasons2 = new ArrayList<>();
        seasons2.add("Весна");
        seasons2.add("Осень");
        seasons2.add("Лето");
        System.out.println(seasons);
        System.out.println(seasons2);

        ArrayList<String> seasons3 = new ArrayList<>(seasons2);
        seasons3.retainAll(seasons);
        System.out.println(seasons3);

        Collection<Integer> one = Arrays.asList(1, 2, 3, 4, 5, 6);
        Collection<Integer> two = Arrays.asList(5, 6, 7, 8, 9, 10);

        Collection<Integer> similar = new HashSet<>(one);
        Collection<Integer> different = new HashSet<>();
        different.addAll(one);
        different.addAll(two);

        similar.retainAll(two);
        different.removeAll(similar);
        System.out.println(similar);
        System.out.println(different);

    }

}
