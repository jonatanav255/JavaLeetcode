package Arrays;

// complexity 
// time = O(N)
// space = O(1)
class P268_MissingNumber {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        //3 * (3 + 1) / 2     
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        P268_MissingNumber solution = new P268_MissingNumber();

        int[] nums1 = {3, 0, 1};

        System.out.println("Test 1: " + solution.missingNumber(nums1));

    }

}

