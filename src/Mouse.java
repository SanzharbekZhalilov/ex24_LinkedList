public class Mouse extends Animals {

    public Mouse(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "age=" + getAge() +
                '}';
    }
}
