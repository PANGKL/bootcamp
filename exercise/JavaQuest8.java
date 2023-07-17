package exercise;

/**
 * Example Output Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    // code here
    int[] nums = new int[] {-10, 5, 100, 240, 230, 80}; // Second Max = 230
    int[] nums2 = new int[] {-10, 5, 100, 120, 240, 200}; // Second Max = 200
    int[] nums3 = new int[] {-10, 5, 120, -100, 100, 240}; // Second Max = 120
    int[] nums4 = new int[] {-10, 5, 100, 240, 240, 80}; // Second Max = 240


    /* ----------------------------------------------------------------------------------------------- */


    // Your program should be able to handle all the above test case.
    int max = -999;
    int secondmax = -999;
    // 1. find max
    // 2. filter which num is lower than max and larger than other number
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > secondmax && nums[i] < max) {
        secondmax = nums[i];
      }
    }
    System.out.println("nums  secound max = " + secondmax);

    /* ----------------------------------------------------------------------------------------------- */

    int max2 = -999;
    int secondmax2 = -999;

    for (int i = 0; i < nums2.length; i++) {
      if (nums2[i] > max2) {
        max2 = nums2[i];
      }
    }
    for (int i = 0; i < nums2.length; i++) {
      if (nums2[i] > secondmax2 && nums2[i] < max2) {
        secondmax2 = nums2[i];
      }
    }

    System.out.println("nums2 secound max = " + secondmax2);

    /* ----------------------------------------------------------------------------------------------- */
    int max3 = -999;
    int secondmax3 = -999;

    for (int i = 0; i < nums3.length; i++) {
      if (nums3[i] > max3) {
        max3 = nums3[i];
      }
    }
    for (int i = 0; i < nums3.length; i++) {
      if (nums3[i] > secondmax3 && nums3[i] < max3) {
        secondmax3 = nums3[i];
      }
    }

    System.out.println("nums3 secound max = " + secondmax3);

    /* ----------------------------------------------------------------------------------------------- */

    int max4 = -999;
    int secondmax4 = -999;
    int multimax4 = 0;
    boolean multi = false;

// find max
    for (int i = 0; i < nums4.length; i++) {
      if (nums4[i] > max4) {
        max4 = nums4[i];
      }
    }

// count is or not multi max value
    for (int i = 0; i < nums4.length; i++) {
      if (nums4[i] == max4) {
        multimax4 += 1;
      }
      if (multimax4 > 1) {
        multi = true;
      }
    }



    for (int i = 0; i < nums4.length; i++) {
      if (multi) {
        if (nums4[i] > secondmax4 && nums4[i] <= max4) {
          secondmax4 = nums4[i];  // secondmax turns to max but value is same, still secondmax
        }
      } else if (nums4[i] > secondmax4 && nums4[i] < max4) { // if not multi max
        secondmax4 = nums4[i];
      }
    }

    System.out.println("nums4 secound max = " + secondmax4);
  }
}
