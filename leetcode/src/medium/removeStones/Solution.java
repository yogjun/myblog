package medium.removeStones;

class Solution {

    int[] p;

    private int find(int n) {
        if (n != p[n]) {
            p[n] = find(p[n]);
        }
        return p[n];
    }

    public int removeStones(int[][] stones) {
        p = new int[stones.length];
        for (int i = 0; i < p.length; i++) p[i] = i;
        for (int i = 0; i < stones.length - 1; i++) {
            for (int j = i + 1; j < stones.length; j++) {
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
                    p[find(i)] = find(j);
                }
            }
        }
        int r = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] != i) r++;
        }
        return r;
    }

    public static void main(String[] args) {
        int[][] m = new int[][]{{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}};
        Solution s = new Solution();
        s.removeStones(m);
    }
}