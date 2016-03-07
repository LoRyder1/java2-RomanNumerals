import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class convertRomanTest {

    private RomanNumeral number;

    public void setRoman(String roman) {
        number = new RomanNumeral(0, roman);
    }

    @Test
    public void passNumeIReturnsOne() {
        setRoman("I");
        assertEquals(1, number.convertRoman());
    }

    @Test
    public void passNumeIIReturnsTwo() {
        setRoman("II");
        assertEquals(2, number.convertRoman());
    }

    @Test
    public void passNumeIIIReturn3() {
        setRoman("III");
        assertEquals(3, number.convertRoman());
    }

    @Test
    public void passNumeVIReturn6() {
        setRoman("VI");
        assertEquals(6, number.convertRoman());
    }

    @Test
    public void passLargeNumeAndIterateOver() {
        setRoman("MLXVI");
        assertEquals(1066, number.convertRoman());
    }

    @Test
    public void passAVeryLageNumeAndIterate() {
        setRoman("MCMLXXXIX");
        assertEquals(1989, number.convertRoman());
    }
}
