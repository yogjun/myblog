package easy.prefixesDivBy5;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        int pfx = 0;
        for(int a :A){
            pfx = (pfx*2+a)%5;
            list.add(pfx==0);
        }
        return list;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.prefixesDivBy5(new int[]{0,1,1,1,1,1,1,1,1});
    }
}