package Day4;

public class Person {

    private int age;

    public Person(int initialAge) {
        this.age = initialAge;
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void yearPasses() {
        this.age = age + 1;
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age == 13 || age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }


}
