package SpringSummer23;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class relocationTest {

    @Test
    void findCountry() {
        Set< Relocation.Country> full = new LinkedHashSet<>();
        full.add(new Relocation.Country(10, 1, 0, 1));
        full.add(new Relocation.Country(9, 0, 1, 2));
        /*Relocation.Country[] full = {new Relocation.Country(10, 1, 0),
                new Relocation.Country(9, 0, 1),
                new Relocation.Country(9, 0, 1),
                new Relocation.Country(9, 0, 1),
                new Relocation.Country(9, 0, 1)};*/
        Relocation.Friend[] friends = {new Relocation.Friend(0, 0 , 2),
                                       new Relocation.Friend(0, 1, 1),
                                       new Relocation.Friend(11, 0, 0),
                                       new Relocation.Friend(10, 1, 0),
                                       new Relocation.Friend(9, 1, 0),
                                       new Relocation.Friend(0, 0 , 2)};
        assertEquals(0, Relocation.findCountry(full, friends));
    }

}