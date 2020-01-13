package staff;

public abstract class Employee {
    protected String name;
    protected String ni;
    protected double salary;

    public Employee(String name, String ni, double salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return ni;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double increment_value) {

        if (increment_value > 0 ){ return salary += increment_value; };

        return salary;
    }

    public double payBonus(){
        return salary / 100;
    }

    public void setName(String newName){
        if (newName != null) {name = newName;}
    };
}
