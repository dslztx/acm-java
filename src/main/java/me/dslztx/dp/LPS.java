package me.dslztx.dp;

/**
 * 最长回文子串<br/>
 * <p>
 * 有字符串s，dp[i][j]表示：s中第i个元素到第j个元素构成的子串是否为回文串<br/>
 * <p>
 * 状态转移方程为：<br/>
 * 1）s[i-1]=s[j-1]，dp[i][j]=dp[i+1][j-1]<br/>
 * 2）s[i-1]!=s[j-1]，dp[i][j]=false
 */
public class LPS {

    char[] s;

    boolean[][] dp;

    public LPS(char[] s) {
        this.s = s;
    }

    public void buildDP() {
        int n = s.length;

        dp = new boolean[n + 1][n + 1];

        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                if (i == j) {
                    dp[i][i] = true;
                } else {
                    if (s[i - 1] != s[j - 1]) {
                        dp[i][j] = false;
                    } else {
                        if (j - 1 < i + 1) {
                            dp[i][j] = true;
                        } else {
                            dp[i][j] = dp[i + 1][j - 1];
                        }
                    }
                }
            }
        }
    }

    public int obtainLPSValue() {
        int n = s.length;

        int maxv = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                if (dp[i][j]) {
                    if (j - i + 1 > maxv) {
                        maxv = j - i + 1;
                    }
                }
            }
        }

        return maxv;
    }
}
