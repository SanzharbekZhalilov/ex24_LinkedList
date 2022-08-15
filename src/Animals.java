public abstract class Animals {

    private int age;

    public Animals(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "age=" + age +
                '}';
    }
}
