package U6T3_Lab1;

public class ArrayAlgorithms {
    

  /** Returns the longest String(s) in an array of Strings.
   *  If multiple strings are tied for longest length, return the last
   *  element in the list with that length.
   *
   *  This method does NOT modify the original array.
   *  PRECONDITION: stringList.length > 0
   */
  public static String longestString(String[] stringList) {
    String longest = "";
    for (String l : stringList) {
        if (l.length() >= longest.length()) {
            longest = l;
        }
    }
    return longest;
  }
  /** Returns true if ANY of the ints in numList are positive, otherwise, 
   *  returns false; use an early return to improve efficiency
   *  note: 0 is not considered positive
   *
   *  This method does NOT modify the original array.
   *  PRECONDITION: numList.length > 0
   */
  public static boolean containsPositive(int[] numList) {
    for (int num : numList) {
        if (num > 0) {
            return true;
        }
    }
    return false;
  }
  public static String[] makeLowercase(String[] wordList) {
    
    for (String word : wordList) {
        word.toLowerCase();
    }
    return wordList;
  }
  public static int endsInExclamations(String[] stringList) {
    int c = 0;
    for (String word : stringList) {
        if (word.indexOf("!") != -1) {
            c++;
        }
    }
    return c;
  }
}