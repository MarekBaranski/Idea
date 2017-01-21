package pl.sda.first;

/**
 * Created by RENT on 2017-01-21.
 */
public class Main {

    public static void main(String[] args) {

        Employee S1 = new Secretary("Barbara", "Kowalska", 1000, 34, "sekretarka");

        System.out.println(S1.getBaseSalary());

        Employee Casual1 = new Casual("Barbara", "Nowak", 1000, 42, "Tester");

        System.out.println(Casual1.getBaseSalary());

        Employee Clark1 = new Clark("Barbara", "Kowal", 1000, 34, "recepcjonistka");

        System.out.println(Clark1.getBaseSalary());


    }



}
