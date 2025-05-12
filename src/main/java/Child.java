import java.util.ArrayList;

class Child extends Person {

    private String parent1;
    private String parent2;
    private ArrayList<Child> siblings;


    public Child(String name, int age, String parent1, String parent2, ArrayList<Child> siblings) {
        super(name, age);
        this.parent1 = parent1;
        this.parent2 = parent2;
        this.siblings = new ArrayList<>();
    }

    public String getParent1() {
        return this.parent1;
    }

    public String getParent2() {
        return this.parent2;
    }

    public ArrayList<Child> getSiblings() {
        return this.siblings;
    }

    public void setSiblings(ArrayList<Child> siblings) {
        this.siblings = siblings;
    }

    public void addSiblings(Child child) {
        this.siblings.add(child);
    }
}