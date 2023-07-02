public class Employee {
    String name;
    double Salary;
    int workHours;
    int hireYear;

    Employee(String name, double Salary, int workHours, int hireYear) {
        this.name = name;
        this.Salary = Salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.Salary < 1000 && this.Salary >= 0) {
            System.out.println("Vergi uygulanmayacak! Maaşınız: " + this.Salary);
        } else if (this.Salary >= 1000) {
            return this.Salary * 0.03;
        }
        return 0;
    }

    int bonus() {
        if (this.workHours < 40) {
            System.out.println("Extra ücret almayacaksınız!");
        } else {
            int result = this.workHours - 40;
            return result * 30;
        }
        return 0;
    }

    double raiseSalary() {
        double now = 2021;
        double result = now - this.hireYear;
        if (result < 10) {
            return this.Salary * 0.05;
        } else if (result >= 9 && result < 20) {
            return this.Salary * 0.1;
        } else if (result >= 19) {
            return this.Salary * 0.15;
        }
        return 0;
    }

    public String toString() {
        System.out.println("Adınız: " + this.name);
        System.out.println("Maaşınız: " + this.Salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Maaş Artışı: " + this.raiseSalary());
        System.out.println("Vergiler ve Bonuslar ile birlikte maaş: " + (this.Salary - this.tax() + this.bonus()));
        System.out.println("Toplam Maaş: " + (this.Salary + this.raiseSalary()));
        return null;
    }
}
