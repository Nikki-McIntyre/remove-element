import java.util.*;
import java.util.Scanner;


class Solution {

  
  public static void main(String args[]) {
    Scanner kbd = new Scanner(System.in);
    System.out.println("How many digits will be in the array? ");
    int[] nums = new int[kbd.nextInt()];
    System.out.println("please enter the digits one at a time ");
    for (int i = 0; i < nums.length; i++) {
      nums[i] = kbd.nextInt();
    }
    System.out.println(" What is the chosen number to remove? ");
    int val = kbd.nextInt();
    System.out.println();
    removeElement(nums, val);
  }

  public static int removeElement(int[] nums, int val) {
    // current index that's available
    int index = 0;
    // how many spaces are to be removed
    int subtract = 0;
    for (int i = 0; i < nums.length; i++) {
      // if it's not the value then set the fist available index to the number being
      // looked at
      if (nums[i] != val) {
        nums[index] = nums[i];
        index++;
      }
      // if it is the value then add 1 more space to be ignored
      else {
        subtract++;
      }
    }
    System.out.println();
    for (int i = 0; i < nums.length - subtract; i++) {
      System.out.println(nums[i]);
    }
    return nums.length - subtract;
  }
}