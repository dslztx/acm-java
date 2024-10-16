package me.dslztx.dp;

/**
 * 最小编辑距离<br/>
 * <p>
 * 有序列m和n，dp[i][j]表示："m到第i个元素为止的子序列"和"n到第j个元素为止的子序列"两者的最小编辑距离<br/>
 * <p>
 * 状态转移方程为：<br/>
 * 1）m[i-1]=n[j-1]，dp[i][j]=min(dp[i-1][j]+1,dp[i][j-1]+1,dp[i-1][j-1]) <br/>
 * 2）m[i-1]!=n[j-1]，dp[i][j]=min(dp[i-1][j]+1,dp[i][j-1]+1,dp[i-1][j-1]+1) <br/>
 */
public class LeastEditingDistance {

    char[] s;
    char[] e;

    int[][] dp;

    public LeastEditingDistance(char[] s, char[] e) {
        this.s = s;
        this.e = e;
    }

    public void buildDP() {
        int m = s.length;
        int n = e.length;

        dp = new int[m + 1][n + 1];

        dp[0][0] = 0;

        for (int j = 1; j <= n; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= m; i++) {
            dp[i][0] = i;
        }

        int v = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s[i - 1] == e[j - 1]) {
                    v = Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1);
                    v = Math.min(v, dp[i - 1][j - 1]);
                    dp[i][j] = v;
                } else {
                    v = Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1);
                    v = Math.min(v, dp[i - 1][j - 1] + 1);
                    dp[i][j] = v;
                }
            }
        }
    }

    public int obtainLeastEditingDistanceValue() {
        return dp[s.length][e.length];
    }
}
