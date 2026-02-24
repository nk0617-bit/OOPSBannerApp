import java.util.HashMap;

public class OOPSBanner {

    /**
     * Creates a HashMap containing ASCII art patterns
     * for supported characters.
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // Letter O
        charMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Letter P
        charMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        // Letter S
        charMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        // Space character
        charMap.put(' ', new String[]{
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
        });

        return charMap;
    }

    /**
     * Displays banner message using character map.
     */
    public static void displayBanner(String message,
                                     HashMap<Character, String[]> charMap) {

        message = message.toUpperCase();

        // Assuming all patterns have same height
        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);

                // If character not found, use space
                if (pattern == null) {
                    pattern = charMap.get(' ');
                }

                sb.append(pattern[line]).append("  ");
            }

            System.out.println(sb.toString());
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}