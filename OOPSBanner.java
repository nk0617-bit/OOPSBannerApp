public class OOPSBanner {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  ***  ",
            " **  ** ",
            "**    **",
            "**    **",
            "**    **",
            " **  ** ",
            "  ***  "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            "****** ",
            "**   **",
            "**   **",
            "****** ",
            "**     ",
            "**     ",
            "**     "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            " ******",
            "**     ",
            "**     ",
            " ***** ",
            "     **",
            "     **",
            "****** "
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {

        // Get patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop to assemble and print "OOPS"
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + "  " +
                oPattern[i] + "  " +
                pPattern[i] + "  " +
                sPattern[i]
            );
        }
    }
}