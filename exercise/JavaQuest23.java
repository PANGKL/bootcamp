package exercise;

/*
 * Question : given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 */

// hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static void main(String[] args) {
    System.out.println(sameNumberOfVowels("book")); // true
    System.out.println(sameNumberOfVowels("textbook")); // false
  }

  public static boolean sameNumberOfVowels(String s) {
    // code here
    String str;
    String str2;
    str = s.substring(0, s.length() / 2);
    str2 = s.substring(s.length() / 2, s.length());

    char[] c = str.toCharArray();
    char[] c2 = str2.toCharArray();
    String aeiou = "aeiouAEIOU";


    for (int i = 0; i < c.length; i++) {
      for (int j = 0; j < c.length; j++) {
        if (c[i] == c2[j]) {
          for (int k = 0; k < aeiou.length(); k++) {
            if (c[i] == aeiou.charAt(k))
              return true;
          }
        }
      }
    }
    // if (count1 > 0 && count2 > 0) {
    // return true;
    return false;
  }

}
