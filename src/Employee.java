public class Employee {
    private String name;
    private String department;
    private int salary;
    private static int counter = 0;
    private final int id;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }


    public int getId() {
        return id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Номер: "+getId()+" ФИО: "+getName()+" Зарплата: "+getSalary()+" Отдел: "+ getDepartment();
    }
}
