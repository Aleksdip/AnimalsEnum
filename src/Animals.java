public enum Animals {
    DOG(3), CAT(5);
     int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal = " + super.toString() + ", age = " + age;
    }
}
