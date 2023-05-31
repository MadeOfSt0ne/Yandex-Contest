package SpringSummer23;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class relocationTest {

    @Test
    void findCountry() {
        Relocation.Country[] countries = {new Relocation.Country(10, 1),
                                     new Relocation.Country(9, 0)};
        Relocation.Friend[] friends = {new Relocation.Friend(0, 0 , 2),
                                  new Relocation.Friend(0, 1, 1),
                                  new Relocation.Friend(11, 0, 0),
                                  new Relocation.Friend(10, 1, 0),
                                  new Relocation.Friend(9, 1, 0)};
        Set<Integer> set = new HashSet<>();
        set.add(2);
        assertEquals(0, Relocation.findCountry(countries, friends, set));
    }
}