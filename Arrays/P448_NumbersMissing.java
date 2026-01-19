package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P448_NumbersMissing {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        P448_NumbersMissing solution = new P448_NumbersMissing();

        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(" ------------------- ");
        System.out.println("Test 1: " + solution.findDisappearedNumbers(nums1));
        System.out.println(" ------------------- ");

    }
}
