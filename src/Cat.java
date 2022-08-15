public class Cat extends Animals {

    public Cat(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + getAge() +
                '}';
    }
}
