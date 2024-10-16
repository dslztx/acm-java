package me.dslztx.dp;

/**
 * 最长公共子序列<br/>
 * <p>
 * 有序列m和n，dp[i][j]表示："m到第i个元素为止的子序列"和"n到第j个元素为止的子序列"两者的最长公共子序列长度<br/>
 * <p>
 * 状态转移方程为：<br/>
 * 1）m[i-1]=n[j-1]，dp[i][j]=dp[i-1][j-1]+1 <br/>
 * 2）m[i-1]!=n[j-1]，dp[i][j]=max(dp[i][j-1],dp[i-1][j])
 */
public class LCS {

    char[] sm;
    char[] sn;
    int[][] dp;

    public LCS(char[] sm, char[] sn) {
        this.sm = sm;
        this.sn = sn;
    }

    public void buildDP() {
        int m = sm.length;
        int n = sn.length;
        dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (sm[i - 1] == sn[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
    }

    public int obtainLCSValue() {
        return dp[sm.length][sn.length];
    }
}
