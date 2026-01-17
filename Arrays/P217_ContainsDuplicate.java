package Arrays;

import java.util.HashSet;

class P217_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
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
