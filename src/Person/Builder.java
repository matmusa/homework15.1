package Person;

public class Builder extends Person{
    @Override
    public void working() {
        super.working();
        System.out.println("Builder build home");
    }
}
