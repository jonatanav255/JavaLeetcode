package Arrays;

import java.lang.management.ClassLoadingMXBean;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// time complexity: 0(N) because it has to loop the whole array
// space complexity: 0(N) the Hashmap can store up to N values

public class P1_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // {2, 7, 11, 15}
        // 7, 2
        // target 9
        Map<Integer, Integer> mapElements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            System.out.println(mapElements);
            if (mapElements.containsKey(complement)) {
                return new int[]{mapElements.get(complement), i};
            }

            mapElements.put(nums[i], i);

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        // int[] nums = {3,2,4};
        // int target = 6;
        int target = 9;
        // Output: [0,1]
        // Output: [1,2]

        P1_TwoSum solution = new P1_TwoSum();

        // nums = [2, 7, 11, 15]
        // Output: [0, 1]
        System.out.println(" ------------------- ");
        System.out.println("Test 1: " + Arrays.toString(solution.twoSum(nums, target)));
        System.out.println(" ------------------- ");

    }
}
