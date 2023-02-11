package Person;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Driver driver = new Driver();
        Driver.setAge(21);
        System.out.println("\nName is "+driver.getName()+","+Driver.getAge()+" years old. ");
        driver.working();
        System.out.println("**********************************");
        Builder builder = new Builder();
        Driver.setAge(23);
        driver.working();
        System.out.println("\n Name is "+builder.getName()+" ,"+Builder.getAge()+"  years old.  ");
        System.out.println("***********************************");

        Programmer programmer = new Programmer();
        programmer.working();
        System.out.println("\n Name is "+programmer.getName()+","+Programmer.getAge()+"years old.");

    }
}