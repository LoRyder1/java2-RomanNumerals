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
                put(1, "I");
            }
        };

    }

    public String convertArabic() {
        StringBuilder roman = new StringBuilder();
        int inputNum = arabic;
        for(Map.Entry<Integer, String> entry : navMap.entrySet()) {
            int repeat = inputNum / entry.getKey();
            String value = entry.getValue();
            for(int i = 0; i < repeat; i++) {
                roman.append(value);
            }
        }
        return roman.toString();
    }
}
