package lesson3Inheritance;

public class Person {
    private int id;
    private static int id_gen = 1;
    private String name;
    private String surname;
    public Person() {
        id = id_gen++;
    }
    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }
    @Override
    public String toString() {
        return id + ": " + name + " " + surname;
    }
}
