package FactoryWorkers;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double increase;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    void raiseSalary() {
        int yearsOfWork = 2021 - hireYear;

        if (yearsOfWork < 10) {
            increase = (salary * 1.05) - salary;
        } else if (yearsOfWork >= 10 && yearsOfWork < 20) {
            increase = (salary * 1.10) - salary;
        } else {
            increase = (salary * 1.15) - salary;
        }
    }

    public String toString() {
        return
                "Adı : " + name +
                        "\nMaaşı : " + salary +
                        "\nÇalışma Saati : " + workHours +
                        "\nBaşlangıç Yıl : " + hireYear +
                        "\nVergi : " + tax() +
                        "\nBonus : " + bonus() +
                        "\nVergi ve Bonuslar ile birlikte maaş : " + (salary + bonus() - tax())
                ;
    }
}
