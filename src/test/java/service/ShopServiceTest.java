package service;

import exception.ShopsAreOnlyForWomenException;
import model.Gender;
import model.Person;
import model.Shop;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ShopServiceTest {

    @Test
    void relateShopWithWoman_addWomanToPersonListInShop() {
        Person woman1
                = new Person("Majka", "Dajka", "Opole", 21, Gender.WOMAN, new ArrayList<>());
        Shop shop = new Shop("Buda", "Warszawa", new ArrayList<>());
        ShopService shopService = new ShopService();
        shopService.relateShopWithWoman(woman1, shop);

        assertThat(shop.getPersonList()).contains(woman1);
    }

    @Test
    void relateShopWithWoman_throwShopsAreOnlyForWomenExceptionWhenRelatingShopWithMan() {
        Person man1 = new Person("Adam", "Jankowski", "Kalisz", 53, Gender.MAN);
        Shop shop = new Shop("Buda", "Warszawa", new ArrayList<>());
        ShopService shopService = new ShopService();

        assertThatThrownBy(() -> shopService.relateShopWithWoman(man1, shop))
                .isInstanceOf(ShopsAreOnlyForWomenException.class);
    }
}