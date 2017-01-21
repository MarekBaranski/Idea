package pl.sda.first;

/**
 * Created by RENT on 2017-01-21.
 */
public abstract class Employee {

    private String name;
    private String surname;
    private double baseSalary;
    private int age;
    private String occupationt;

    public Employee(String name, String surname, double baseSalary, int age, String occupationt) {
        this.name = name;
        this.surname = surname;
        this.baseSalary = baseSalary;
        this.age = age;
        this.occupationt = occupationt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupationt() {
        return occupationt;
    }

    public void setOccupationt(String occupationt) {
        this.occupationt = occupationt;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", baseSalary=" + baseSalary +
                ", age=" + age +
                ", occupationt='" + occupationt + '\'' +
                '}';
    }
}
