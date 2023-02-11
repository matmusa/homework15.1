package Person;

public class Person {

    private final String name = "Matmusa";
    private static int age;


    public String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Person.age = age;
    }

    public void working() {
    }


}
