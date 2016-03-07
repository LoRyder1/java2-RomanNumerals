import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class convertArabicTest {

    private RomanNumeral number;

    private void setArabic(int num) {
        number = new RomanNumeral(num);
    }

    @Test
    public void passOneAndReturnsNumeralI() {
        setArabic(1);
        assertEquals("I", number.convertArabic());
    }

    @Test
    public void passTwoAndReturnsNumeralII() {
        setArabic(2);
        assertEquals("II", number.convertArabic());
    }

    @Test
    public void passThreeAndReturnsAppendedStringIII() {
        setArabic(3);
        assertEquals("III", number.convertArabic());
    }

    @Test
    public void passFourAndReturnNumeralIV() {
        setArabic(4);
        assertEquals("IV", number.convertArabic());
    }

}
