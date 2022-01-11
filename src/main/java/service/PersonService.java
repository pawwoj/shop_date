package service;

import exception.NoWomenException;
import model.Gender;
import model.Person;
import model.Shop;

import java.util.Comparator;
import java.util.List;

public class PersonService {

    public Person getOldestWomanFromList(List<Person> personList) {
        List<Person> list =
                personList.stream()
                        .filter(person -> person.getGender().equals(Gender.WOMAN))
                        .sorted(Comparator.comparing(Person::getAge).reversed())
                        .toList();
        if (list.isEmpty())
            throw new NoWomenException();

        return list.get(0);
    }

    public int checkIfAgeIsOver18(int age) {
        try {
            if (age < 18)
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return 18;
        }
        return age;
    }

    public void relationPersonWithShop(Person person, Shop shop) {
        person.getShopList().add(shop);
    }
}