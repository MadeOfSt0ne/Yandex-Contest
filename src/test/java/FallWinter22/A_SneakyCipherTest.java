package FallWinter22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A_SneakyCipherTest {

    @Test
    void getCipher1() {
        String[] interns = {"Volozh,Arcady,Yurievich,11,2,1964", "Segalovich,Ilya,Valentinovich,13,9,1964"};
        assertEquals(0, A_SneakyCipher.getCipher(interns));
    }
}