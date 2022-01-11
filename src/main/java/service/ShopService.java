package service;

import exception.ShopsAreOnlyForWomenException;
import model.Gender;
import model.Person;
import model.Shop;

public class ShopService {

    public void relateShopWithWoman(Person person, Shop shop) {
        if (person.getGender().equals(Gender.MAN))
            throw new ShopsAreOnlyForWomenException();

        shop.getPersonList().add(person);
        // person.getShopList().add(shop);
    }
}