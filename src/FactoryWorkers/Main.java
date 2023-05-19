package FactoryWorkers;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("kemal", 2000, 45, 1985);
        String info = employee.toString();
        System.out.println(info);
        employee.raiseSalary();
        System.out.println("Maaş Artışı : " + (employee.increase));
        System.out.println("Toplam maaş : " + (employee.salary + employee.increase));
    }
}
