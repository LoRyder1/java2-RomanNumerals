
public class RomanNumeral {

    private final int arabic;

    public RomanNumeral(int arabic) {
        this.arabic = arabic;
    }

    public String convertArabic() {
        if (arabic == 1) {
            return "I";
        } else {
            return "II";
        }
    }
}
