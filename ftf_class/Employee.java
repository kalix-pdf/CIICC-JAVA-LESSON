package ftf_class;

public class Employee {
    public String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateTax() {
        final double TAX_RATE = 0.12;

        return salary * TAX_RATE;
    }
}
