import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class convertRomanTest {

    private RomanNumeral number;

    public void setRoman(String roman) {
        number = new RomanNumeral(0, roman);
    }

    @Test
    public void passNumeralIReturnsOne() {
        setRoman("I");
        assertEquals(1, number.convertRoman());
    }

    @Test
    public void passNumeralIIReturnsTwo() {
        setRoman("II");
        assertEquals(2, number.convertRoman());
    }
}
