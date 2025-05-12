class Parent extends Person{
    
    private Parent spouse;
    private Child[] children;

    public Parent(String name, int age, Parent spouse) {
        super(name, age);
        this.spouse = spouse; 
        this.children = new Child[0];
    }

    public Parent(String name, int age) {
        super(name, age);
        this.spouse = null;
        this.children = new Child[0];
    }

    public Parent getSpouse() {
        return this.spouse;
    }       
    
    public void setSpouse(Parent spouse)  {
        this.spouse = spouse;
    }

    public Child[] getChildren() {
        return children;
    }
    
    public void setChildren(Child[] children) {
        this.children = children;
    }  

    public void addChild(Child child) {

    }
}