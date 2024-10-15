package me.dslztx.dp;

/**
 * 最长公共子序列
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
                    if (dp[i - 1][j] > dp[i][j - 1]) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i][j - 1];
                    }
                }
            }
        }
    }

    public int obtainLCSValue() {
        return dp[sm.length][sn.length];
    }
}
