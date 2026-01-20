package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P1_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapElements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (mapElements.containsKey(complement)) {
                return new int[]{mapElements.get(complement), i};
            }

            mapElements.put(nums[i], i);

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        P1_TwoSum solution = new P1_TwoSum();

        // nums = [2, 7, 11, 15]
        // Output: [0, 1]
        System.out.println(" ------------------- ");
        System.out.println("Test 1: " + Arrays.toString(solution.twoSum(nums, target)));
        System.out.println(" ------------------- ");

    }
}
