class Child extends Person {

    private String parent1;
    private String parent2;

    public Child(String name, int age, String parent1, String parent2) {
        super(name, age);
        this.parent1 = parent1;
        this.parent2 = parent2;
    }

}