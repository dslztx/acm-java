package me.dslztx.dp.pack;

/**
 * 完全背包问题，空间优化版本，具体可参阅《背包九讲》讲义
 */
public class CompletePack {

    int volume;

    int[] weight;

    int[] value;

    int[] dp;

    public CompletePack(int volume, int[] weight, int[] value) {
        this.volume = volume;
        this.weight = weight;
        this.value = value;
    }

    public void buildDP() {
        dp = new int[volume + 1];

        int n = weight.length;
        for (int i = 1; i <= n; i++) {
            for (int v = weight[i - 1]; v <= volume; v++) {
                dp[v] = Math.max(dp[v], dp[v - weight[i - 1]] + value[i - 1]);
            }
        }
    }

    public int obtainDPValue() {
        return dp[volume];
    }
}
