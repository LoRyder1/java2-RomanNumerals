import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class RomanNumeral {

    private final int arabic;
    private NavigableMap<Integer, String> navMap;

    public RomanNumeral(int arabic) {
        this.arabic = arabic;

//  The outer pair of braces means that you are declaring and initializing an anonymous inner class that extends TreeMap. The inner pair of braces represents an instance initializer, code that is run when an instance is created.

        navMap = new TreeMap<Integer, String>() {
            {
                put(1000, "M");
                put(900, "CM");
                put(500, "D");
                put(400, "CD");
                put(100, "C");
                put(90, "XC");
                put(50, "L");
                put(40, "XL");
                put(10, "X");
                put(9, "IX");
                put(5, "V");
                put(4, "IV");
                put(1, "I");
            }
        }.descendingMap();

    }

    private StringBuilder roman = new StringBuilder();

    public String convertArabic() {
        int inputNum = arabic;
        for(Map.Entry<Integer, String> entry : navMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            int repeat = inputNum / key;
            buildString(value, repeat);
            inputNum %= key;
        }
        return roman.toString();
    }

    private void buildString(String value, int repeat) {
        for(int i = 0; i < repeat; i++) {
            roman.append(value);
        }
    }
}
