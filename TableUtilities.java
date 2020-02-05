

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
      String result = "";
      result = getMultiplicationTable(5);
      return result;
    }

    public static String getLargeMultiplicationTable() {
        String result = "";
        result = getMultiplicationTable(10);
        return result;
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
