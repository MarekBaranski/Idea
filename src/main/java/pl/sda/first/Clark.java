package pl.sda.first;

/**
 * Created by RENT on 2017-01-21.
 */
public class Clark extends Employee {

    public static double salaryMultiplication = 100;

    public Clark(String name, String surname, double baseSalary, int age, String occupationt) {
        super(name, surname, baseSalary, age, occupationt);
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary()+ salaryMultiplication;
    }

}
