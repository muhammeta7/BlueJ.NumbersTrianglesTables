

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
      return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        for (int row = 1 ; row <= tableSize ; row++) {
            for (int col = 1 ; col <= tableSize ; col++) {
                if ( row * col < 10) {
                  result += "  " + row*col + " |";
                }
                else if ( (row*col >= 10) && (row*col <100) ) {
                  result += " " + row*col + " |";
                }
                else {
                  result += row*col + " |";
                }
            }
            result += "\n";
        }
        return result;
    }
}
