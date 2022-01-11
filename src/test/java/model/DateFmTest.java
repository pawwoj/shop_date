package model;

import exception.NoHomoHereException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class DateFmTest {

    @Test
    void dateFm_constructorThrowNoHomoHereExceptionWhenAddingTwoPersonsWithSameGender() {
        Person man1 = new Person("Adam", "Jankowski", "Kalisz", 53, Gender.MAN);
        Person man2 = new Person("Jan", "Niezbędny", "Olsztyn", 19, Gender.MAN);

        assertThatThrownBy(() -> new DateFm(man1, man2)).isInstanceOf(NoHomoHereException.class);
    }

    @Test
    void dateFm_ClassContainTwoPersonsWomanAndManAsValue() {
        Person woman1
                = new Person("Majka", "Dajka", "Opole", 21, Gender.WOMAN, new ArrayList<>());
        Person man1 = new Person("Adam", "Jankowski", "Kalisz", 53, Gender.MAN);
        DateFm dateFm = new DateFm(woman1, man1);

        assertThat(dateFm.getWoman()).isEqualTo(woman1);
        assertThat(dateFm.getMan()).isEqualTo(man1);
    }
}