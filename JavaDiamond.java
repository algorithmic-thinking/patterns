public class JavaDiamond {

    public static void main(String[] args) {
        int n = 4;
        int character = 97;

        String[][] array = getDiamond(n, character);
        printArray(array);

    }

    /**
     * Get an array for a (2n+1) * (2n+1) diamond
     * 
     * @param n
     * @param character
     * @return
     */
    protected static String[][] getDiamond(int n, int character) {
        String[][] printable = new String[2 * n + 1][2 * n + 1];

        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                if (Math.abs(i) + Math.abs(j) <= n)
                    printable[i + n][j + n] = (char) (character + Math.abs(j)) + " ";
                else
                    printable[i + n][j + n] = "  ";
            }
        }

        return printable;
    }

    /**
     * Prints a two dimensional array
     * 
     * @param array
     */
    protected static void printArray(String[][] array) {
        for (String[] row : array) {
            for (String element : row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }

}
