package pl.sda.first;

/**
 * Created by RENT on 2017-01-21.
 */
public class Secretary extends Employee{

    public static double salaryMultiplication = 1.23;

    public Secretary(String name, String surname, double baseSalary, int age, String occupationt) {
        super(name, surname, baseSalary, age, occupationt);
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary()* salaryMultiplication;
    }
}
