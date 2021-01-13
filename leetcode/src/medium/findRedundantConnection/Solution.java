package medium.findRedundantConnection;

class Solution {
    int[] p;

    /**
     * 查找祖宗节点
     *
     * @param x
     * @return
     */
    public int find(int x) {
        if (p[x] == x) {
            return x;
        } else {
            p[x] = find(p[x]);
            return p[x];
        }
    }

    public int[] findRedundantConnection(int[][] edges) {
        p = new int[edges.length + 1];
        for (int i = 0; i < p.length; i++) p[i] = i;
        for (int i = 0; i < edges.length; i++) {
            int a = find(p[edges[i][0]]);
            int b = find(p[edges[i][1]]);
            if (a == b) {
                return edges[i];
            } else {
                p[find(edges[i][0])] = find(p[edges[i][1]]);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] m = new int[][]{{3, 4}, {1, 2}, {2, 4}, {3, 5}, {2, 5}};
//        int[][] m = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
//        int[][] m = new int[][]{{1, 2}, {1, 3}, {2, 3}};
        s.findRedundantConnection(m);
    }
}