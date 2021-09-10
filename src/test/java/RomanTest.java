import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanTest {
    @Test
    void shouldConvert1ToI() {
        assertEquals("I", RomanNumbers.toRoman(1));
    }
    @Test
    void shouldConvert2ToII() {
        assertEquals("II", RomanNumbers.toRoman(2));
    }
    @Test
    void shouldConvert37ToXXXVII() {
        assertEquals("XXXVII", RomanNumbers.toRoman(37));
    }
}
