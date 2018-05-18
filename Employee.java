package Lab4;

public abstract class Employee implements Employable, Comparable {

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    abstract double getOverTimePayRate();

}
