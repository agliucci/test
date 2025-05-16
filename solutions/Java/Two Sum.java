class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> vals = new HashMap<>();
        int[] result = new int[2];
        // test
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (!vals.containsKey(diff)) {
                vals.put(nums[i], i);
            } else {
                result[0] = vals.get(diff);
                result[1] = i;
            }
        }
        return result;
    }
}