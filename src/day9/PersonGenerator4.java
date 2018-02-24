package day9;

public class PersonGenerator4 {
    public static void main(String[] args) {

        PersonManager personManager = new PersonManager();

        personManager.initialize();

        Person person = new Person();
        person.name="동희";
        person.age = 99;

        personManager.addPerson(person);

        personManager.printPersons();

    }
}
