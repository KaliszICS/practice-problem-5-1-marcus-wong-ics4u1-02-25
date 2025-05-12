import java.util.ArrayList;

class Parent extends Person{
    
    private String spouseField;
    private ArrayList<Child> children;

    public Parent(String name, int age, String spouseField, ArrayList<Child> children) {
        super(name, age);
        this.spouseField = spouseField; 
        this.children = new ArrayList<>();
    }

    public Parent(String name, int age) {
        super(name, age);
        this.spouseField = null;
        this.children = new ArrayList<>();
    }

    public String getSpouse() {
        return this.spouseField;
    }       
    
    public void setSpose(String spouseField)  {
        this.spouseField = spouseField;
    }

    public ArrayList<Child> getChildren() {
        return this.children;
    }
    
    public void setChildren(ArrayList<Child> children) {
        this.children = children;
    }

    public void addChild(Child child) {
        this.children.add(child);
    }   
}