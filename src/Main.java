import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

/*      - Положить в LinkedList 50 кошек и собак.
        - Удалить каждую 5-кошку.
        - Через каждую 3-собаку добавить мышку.
        - Всех кошек которые находятся рядом с мышами переместить в другой LinkedList и удалить.
        - Переместить все объекты с LinkedList в новый ArrayList.
        - Найти сумму возрастов всех объектов (у всех объектов должен быть возраст).
*/
        int catAge = 1;
        int dogAge = 1;

        LinkedList<Animals> animals = new LinkedList<>();

        System.out.println("Положить в LinkedList 50 кошек и собак:");
        for (int i = 0; i < 50; i++) {
            animals.add(new Cat(catAge++));
            animals.add(new Dog(dogAge++));
        }
        System.out.println(animals);

        System.out.println("Удалить каждую 5-кошку:");
        int count = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat) {
                count++;
                if (count % 5 == 0) {
                    animals.remove(animals.get(i));
                }
            }
        }
        System.out.println(animals);

        System.out.println("Через каждую 3-собаку добавить мышку:");
        int mouseAge = 0;
        count = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Dog) {
                count++;
                if (count % 3 == 0) {
                    animals.add(i + 1, new Mouse(mouseAge + count));
                }
            }
        }
        System.out.println(animals);

        System.out.println("Всех кошек которые находятся рядом с мышами переместить в другой LinkedList и удалить");
        LinkedList<Cat> cats = new LinkedList<>();
        for (int i = 1; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat) {
                if (animals.get(i - 1) instanceof Mouse || animals.get(i + 1) instanceof Mouse) {
                    cats.add((Cat) animals.get(i));
                    animals.remove(animals.get(i));
                }
            }
        }
        System.out.println(animals);
        System.out.println(cats);

        System.out.println("Переместить все объекты с LinkedList в новый ArrayList:");
        ArrayList<Animals> animalsArrayList = new ArrayList<>(animals);
        System.out.println(animalsArrayList);

        System.out.println("Найти сумму возрастов всех объектов:");
        int sumAgeCat = 0;
        int sumAgeDog = 0;
        int sumAgeMouse = 0;
        for (Animals animal : animals) {
            if (animal instanceof Cat) {
                sumAgeCat += animal.getAge();
            } else if (animal instanceof  Dog) {
                sumAgeDog += animal.getAge();
            } else {
                sumAgeMouse += animal.getAge();
            }
        }

        System.out.println("Сумма возрастов кошек: " + sumAgeCat);
        System.out.println("Сумма возрастов собак: " + sumAgeDog);
        System.out.println("Сумма возрастов мышек: " + sumAgeMouse);

    }
}