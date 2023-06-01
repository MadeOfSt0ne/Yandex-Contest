package SpringSummer23;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class relocationTest {

    @Test
    void findCountry() {
        List<Relocation.Country> countries = new ArrayList<>();
            countries.add(new Relocation.Country(10, 1, 1));
            countries.add(new Relocation.Country(9, 0, 2));
        Relocation.Friend[] friends = {new Relocation.Friend(0, 0 , 2),
                                  new Relocation.Friend(0, 1, 1),
                                  new Relocation.Friend(11, 0, 0),
                                  new Relocation.Friend(10, 1, 0),
                                  new Relocation.Friend(9, 1, 0)};
        Set<Integer> set = new HashSet<>();
        set.add(2);
        assertEquals(0, Relocation.findCountry(countries, friends, set));
    }

    @Test
    void sixArrays() {
        int[] cM = {10, 9};
        int[] cE = {1, 0};
        int[] cP = {0, 1};
        int[] fM = {0, 0, 11, 10, 9};
        int[] fE = {0, 1, 0, 1, 1};
        int[] fP = {2, 1, 0, 0, 0};
        assertEquals(0, Relocation.sixArrays(cM, cE, cP, fM, fE, fP));
    }
}