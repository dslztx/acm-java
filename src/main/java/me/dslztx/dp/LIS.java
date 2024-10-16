package me.dslztx.dp;

/**
 * 最长递增子序列<br/>
 * <p>
 * 有数字数组nums，dp[i]表示：n中以第i个元素为尾的最长递增子序列的长度<br/>
 * <p>
 * 状态转移方程为：<br/>
 * dp[i]=max(dp[j])+1。1<=j<i，且nums[j-1]<nums[i-1]
 */
public class LIS {

    int[] nums;
    int[] dp;

    public LIS(int[] nums) {
        this.nums = nums;
    }

    public void buildDP() {
        int n = nums.length;
        dp = new int[n + 1];

        int maxv = 0;
        for (int i = 1; i <= n; i++) {
            maxv = 0;

            for (int j = 1; j < i; j++) {
                if (nums[j - 1] < nums[i - 1]) {
                    if (dp[j] > maxv) {
                        maxv = dp[j];
                    }
                }
            }

            dp[i] = maxv + 1;
        }
    }

    public int obtainLISValue() {
        return dp[nums.length];
    }
}
