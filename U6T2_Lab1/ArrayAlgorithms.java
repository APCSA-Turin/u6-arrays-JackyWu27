

public class ArrayAlgorithms {
    
  // figure out how to similarly use a for loop to print
  // each element in the array, one number per line:
  public static double average (int[] numList) {
  double count = 0.0;
  for (int c = 0; c < numList.length; c ++) {
    count += numList[c];  
    }
  return (count / numList.length);
  }

  public static int minimum(int[] numList) {
  int count = numList[0];
  for (int c = 0; c < numList.length; c ++) {
    if (numList[c] < count) {
      count = numList[c];  
    } 
  }
  return count;
  }
  public static int howManyContain(String[] strList, String target) {
    int count = 0;
  for (int c = 0; c < strList.length; c ++) {
    if (strList[c].indexOf(target) != -1) {
      count ++; 
    } 
  }
  return count; 
  }

  public static String[] stringToArray(String myStr) {
    String[] strList = new String[myStr.length()];
  for (int c = 0; c < strList.length; c ++) {
    strList[c] = Character.toString(myStr.charAt(c));
  }
  return strList; 
  }

  public static void introduceAdults(Person[] people) {
    for (int c = 0; c < people.length; c ++) {
      if (people[c].getAge() > 17) {
        people[c].introduce();
      }
    }
  }

  public static void reversePrint(String[] wordList) {
    for (int c = wordList.length - 1; c >= 0; c --) {
      String desrever = "";
      for (int index = wordList[c].length(); index > 0; index--) {
        desrever += wordList[c].substring(index - 1, index);
      }
      System.out.println(desrever);
    }
  }
  public static int[] combine(int[] arr1, int[] arr2) {
    int [] arr3 = new int[arr1.length + arr2.length];
    for (int c = 0; c < arr1.length; c ++) {
      arr3[c] = arr1[c];
    }
    for (int c = 0; c < arr2.length; c ++) {
      arr3[arr1.length + c] = arr2[c];
    }
    return arr3;
  }

  public static void bookEnd(int[] nums, int num) {
    nums[0] = num;
    nums[nums.length - 1] = num;
  }

  public static void multiplyBy(int[] numList, int multiplier) {
    for (int c = 0; c < numList.length; c++) {
     numList[c] *= multiplier;
    }
  }

  public static int[] multiplyByNoModify(int[] numList, int multiplier) {
  int[] keep = new int [numList.length];
  for (int c = 0; c < numList.length; c++) {
    keep [c] = numList[c] * multiplier;
    }
  return keep;
  }

  public static void addExclamation(String[] wordList) {
    for (int c = 0; c < wordList.length; c++) {
      wordList[c] += "!";
    }
  }

  public static boolean[] isFreezing(int[] tempList) {
  boolean[] keep = new boolean [tempList.length];
  for (int c = 0; c < tempList.length; c++) {
    if (tempList[c] < 33) {
      keep [c] = true;
    } else {
      keep [c] = false;
    }
  }
  return keep;
  }

  public static void shiftLeft(int[] numList) {
  int [] keep = new int [numList.length];
  for (int c = 0; c < numList.length - 1; c++) {
    keep [c] = numList[c + 1];
  }
  keep [keep.length - 1] = numList[0];
  for (int c = 0; c < numList.length; c++) {
    numList [c] = keep[c];
    }
  }

  public static void shiftRight(int[] numList) {
  int [] keep = new int [numList.length];
  keep [0] = numList[keep.length - 1];
  for (int c = 1; c < numList.length; c++) {
    keep [c] = numList[c - 1];
  }
  
  for (int c = 0; c < numList.length; c++) {
    numList [c] = keep[c];
    }
  }

  public static void reverse(int[] numList) {
    int count = numList.length - 1;
    for (int c = 0; c < (numList.length - 1) / 2; c++) {
      int temp = numList[c];
      numList[c] = numList[count];
      numList[count] = temp;
      count --;
    }
  }

  


}