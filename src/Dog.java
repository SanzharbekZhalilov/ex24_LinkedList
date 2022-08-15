public class Dog extends Animals {

    public Dog(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + getAge() +
                '}';
    }
}
