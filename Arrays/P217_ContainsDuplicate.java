package Arrays;

import java.util.HashSet;
import java.util.Set;

class P217_ContainsDuplicate {

    // time complexity 0(n)
    // space complexity 0(n)
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen  = new HashSet<>(); // extra space

        for (int num : nums) { // 0(n) - iterate through array 
            if (!seen.add(num)) { // 0(1) HashSet Add operation
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        P217_ContainsDuplicate solution = new P217_ContainsDuplicate();

        int[] nums1 = {1, 2, 3, 1};

        System.out.println(" ------------------- " );
        System.out.println("Test 1: " + solution.containsDuplicate(nums1));
        System.out.println(" ------------------- " );

    }
}
