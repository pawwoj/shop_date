package application;

import model.DateFm;
import model.Gender;
import model.Person;
import model.Shop;
import service.PersonService;
import service.ShopService;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public void run() {
        // PLAYGROUND
        /*PersonService personService = new PersonService();
        Person man1 = new Person("Jan", "Kowalski", "Warszawa", 31, Gender.MAN);
        Person man2 = new Person("Adam", "Jankowski", "Kalisz", 53, Gender.MAN);
        Person man3 = new Person("Stefan", "Fajfofski", "Toruń", 21, Gender.MAN);
        Person man4 = new Person("Kamil", "Glupowski", "Wrocław", 67, Gender.MAN);

        Person woman1
                = new Person("Majka", "Dajka", "Opole", 21, Gender.WOMAN, new ArrayList<>());
        Person woman2
                = new Person("Kasia", "Mokra", "Kraków", 34, Gender.WOMAN, new ArrayList<>());
        Person woman3
                = new Person("Daria", "Zierka", "Gdynia", 97, Gender.WOMAN, new ArrayList<>());
        Person woman4
                = new Person("Frania", "Mia", "Zakopane", 54, Gender.WOMAN, new ArrayList<>());

        System.out.println(man1);
        System.out.println(woman1);

        Person manJung
                = new Person("Zbyszek", "Florek", "Radom"
                , personService.checkIfAgeIsOver18(12), Gender.MAN);
        System.out.println(manJung);
        List<Person> manList = List.of(man1, man2, man3, man4);
        List<Person> personList = List.of(man1, man2, man3, man4, woman1, woman2, woman3, woman4);

        System.out.println(personService.getOldestWomanFromList(manList));
        personService.getOldestWomanFromList(manList);

        Shop shop = new Shop("Buda", "Warszawa", new ArrayList<>());
        ShopService shopService = new ShopService();
        shopService.relateShopWithWoman(woman3, shop);
        personService.relationPersonWithShop(woman1, shop);
        System.out.println(shop);
        System.out.println(woman1);
        System.out.println(personService.getOldestWomanFromList(personList));

        DateFm dateFm1 = new DateFm(woman1, man1);
        System.out.println(dateFm1);

        DateFm dateFm2 = new DateFm(man1, man2);
        System.out.println(dateFm2);*/

    }
}
