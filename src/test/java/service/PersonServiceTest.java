package service;

import exception.NoWomenException;
import model.Gender;
import model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PersonServiceTest {

    @Test
    void checkIfAgeIsOver18_return18WhenGivenIs5() {
        PersonService personService = new PersonService();
        assertThat(personService.checkIfAgeIsOver18(5)).isEqualTo(18);
    }

    @Test
    void checkIfAgeIsOver18_returnedValueIsNotEqual5WhenGivenIs5() {
        PersonService personService = new PersonService();
        assertThat(personService.checkIfAgeIsOver18(5)).isNotEqualTo(5);
    }

    @Test
    void checkIfAgeIsOver18_return31WhenGivenIs31() {
        PersonService personService = new PersonService();
        assertThat(personService.checkIfAgeIsOver18(31)).isEqualTo(31);
    }

    @Test
    void getOldestWomanFromList_throwsNoWomenExceptionWhenOnListAreNoWoman() {
        Person man1 = new Person("Jan", "Kowalski", "Warszawa", 31, Gender.MAN);
        Person man2 = new Person("Adam", "Jankowski", "Kalisz", 53, Gender.MAN);
        List<Person> manList = List.of(man1, man2);
        PersonService personService = new PersonService();

        assertThatThrownBy(() -> personService.getOldestWomanFromList(manList))
                .isInstanceOf(NoWomenException.class);
    }

    @Test
    void getOldestWomanFromList_returnOldestWomanFromGivenList() {
        Person man1 = new Person("Jan", "Kowalski", "Warszawa", 31, Gender.MAN);
        Person man2 = new Person("Adam", "Jankowski", "Kalisz", 53, Gender.MAN);
        Person woman3 = new Person("Daria", "Zdzierka", "Gdynia", 97, Gender.WOMAN);
        Person woman4 = new Person("Frania", "Mania", "Zakopane", 54, Gender.WOMAN);
        List<Person> personList = List.of(man1, man2, woman3, woman4);
        PersonService personService = new PersonService();

        assertThat(personService.getOldestWomanFromList(personList)).isEqualTo(woman3);
    }
}

