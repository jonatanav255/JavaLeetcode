package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// time complexity = O (n log n)
// space complexity = O(N)
public class P1365_HowMany {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < sorted.length; i++) {

            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], i);
            }
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }

        return result;

        // System.out.println(map);
        // return new int[]{};
    }

    public static void main(String[] args) {
        P1365_HowMany solution = new P1365_HowMany();

        int[] nums1 = {8, 1, 2, 2, 3};
        // Output: [4,0,1,1,3]
        System.out.println("Test 1: " + Arrays.toString(solution.smallerNumbersThanCurrent(nums1)));
        // Expected: [4, 0, 1, 1, 3]

        int[] nums2 = {6, 5, 4, 8};
        System.out.println("Test 2: " + Arrays.toString(solution.smallerNumbersThanCurrent(nums2)));
        // Expected: [2, 1, 0, 3]
    }
}
