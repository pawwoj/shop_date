package model;

import exception.NoHomoHereException;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class DateFm {
    Person woman;
    Person man;

    public DateFm(Person woman, Person man) {
        this.woman = woman;
        this.man = man;

        if (woman.getGender().equals(man.getGender()))
            throw new NoHomoHereException();
    }
}