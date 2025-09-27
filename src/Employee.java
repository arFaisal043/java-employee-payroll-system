abstract class Employee {

    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name  = name;
        this.id = id;
    }

    // abstract method
    abstract public double calcSalary();

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Employee [name = " + name + ", id = " + id + ", salary = " + calcSalary() + "]";
    }
}
