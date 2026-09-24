class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaydetails() {
        System.out.println("Employee Name:" + name);
        System.out.println("Employee Salary:" + salary);
    }
}

class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("Yash", 5000000);
        emp.displaydetails();

    }
}
