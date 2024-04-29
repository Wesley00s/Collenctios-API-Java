package list.order;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class OrderPerson {
    private List<Person> persons;

    public OrderPerson() {
        this.persons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        this.persons.add(person);
    }

    public void removePerson(Person person) {
        this.persons.remove(person);
    }

    public List<Person> orderByAge() {
        List<Person> personsByAge = new ArrayList<>(persons);
        Collections.sort(personsByAge);
        return personsByAge;
    }

    public List<Person> orderByHeight() {
        List<Person> personsByHeight = new ArrayList<>(persons);
        personsByHeight.sort(new ComparatorByHeight());
        return personsByHeight;
    }
}
