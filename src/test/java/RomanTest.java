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
}
