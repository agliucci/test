function maxSubArray(nums: number[]): number {
    let maxSum = nums[0];
    let currSum = 0;

    for (let i = 0; i < nums.length; i++) {
        currSum = Math.max(currSum, 0) + nums[i];
        maxSum = Math.max(maxSum, currSum);
    }
    return maxSum;
};