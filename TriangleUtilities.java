

public class TriangleUtilities {
    public static String getRow(int numberOfStars) {
        String result = "";
        for (int i = 1; i <= numberOfStars ; i++) {
            result += "*";
        }
        return result;
    }

    public static String getTriangle(int numberOfRows) {
      String result = "";
      for (int i = 1; i <= numberOfRows; i++) {
        result += getRow(i)+ '\n';
      }
      return result;
    }


    public static String getSmallTriangle() {
        String result = "";
        for (int i = 1; i <= 4 ; i++) {
            result += getRow(i) + '\n';
        }
        return result;
    }

    public static String getLargeTriangle() {
        String result = "";
        for (int i = 1; i <=9; i++) {
          result += getRow(i) + '\n';
        }
        return result;
    }
}
