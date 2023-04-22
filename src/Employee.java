public class Employee {
    private String fullname;
    private int salary;
    private int department;
    public static int employeeCounter = 0;
    int id;

    public Employee(String fullname,  int department, int salary) {
        this.fullname = fullname;
        this.salary = salary;
        this.department = department;
        id = employeeCounter;
        employeeCounter ++;
    }

    public String getFullname() {
        return fullname;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "Сотрудник № " + id +
                " Ф.И.О. " + fullname  +
                ", зарплата " + salary +
                ", отдел " + department +
                '.';

    }
}

