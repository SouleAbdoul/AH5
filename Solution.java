import java.util.*;

class Solution {
    public static char mostFrequentChar(String s) {
        char[] arr = s.toCharArray();
        int[] arr1 = new int[256];
        int max_occ = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                int val = (int) arr[i];
                arr1[val]++;
                if (arr1[val] > max_occ) {
                    max_occ = arr1[val];
                }
            }

        }
        char result = 'a';
        for (int k = 0; k < arr1.length; k++) {
            if (max_occ == arr1[k]) {
                char c = (char) k;
                result = c;

            }

        }
        return result;
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
        System.out.println(Solution.mostFrequentChar("eleventennine"));
        System.out.println(Solution.mostFrequentChar("david"));
    }

  }
