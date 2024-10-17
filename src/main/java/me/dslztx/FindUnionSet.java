package me.dslztx;

/**
 * 带路径压缩的并查集
 */
public class FindUnionSet {

    int[] fus;

    public FindUnionSet(int[] fus) {
        this.fus = fus;

        for (int i = 0; i < fus.length; i++) {
            fus[i] = -1;
        }
    }

    public int find(int a) {
        if (fus[a] == -1) {
            return a;
        }

        fus[a] = find(fus[a]);

        return fus[a];
    }

    public void union(int a, int b) {
        int aRoot = find(a);
        int bRoot = find(b);

        if (aRoot != bRoot) {
            fus[aRoot] = bRoot;
        }
    }

}
