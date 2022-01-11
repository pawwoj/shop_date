package model;

import lombok.*;

import java.util.List;

@EqualsAndHashCode
@Getter
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
public class Person {
    @NonNull
    String firstname;
    @NonNull
    String lastName;
    @NonNull
    String City;
    @NonNull
    int age;
    @NonNull
    Gender gender;
    List<Shop> shopList;
}
