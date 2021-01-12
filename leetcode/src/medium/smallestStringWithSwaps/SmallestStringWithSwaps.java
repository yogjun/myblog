package medium.smallestStringWithSwaps;

import java.util.*;

/**
 * {@link SmallestStringWithSwaps} 解题思路可以使用并查集
 *
 * @author <a href="mailto:matthew.miao@yunlsp.com">Matthew.miao</a>
 * @version ${project.version} - 2021/1/11
 */
public class SmallestStringWithSwaps {

    int[] p;

    /**
     * 返回祖宗节点
     *
     * @param x
     * @return
     */
    public int find(int x) {
        if (p[x] == x) {
            return x;
        } else {
            return find(p[x]);
        }
    }

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        //初始化散列集合
        p = new int[s.length()];
        for (int i = 0; i < s.length(); i++) p[i] = i;
        for (List<Integer> pair : pairs) {
            p[find(pair.get(0))] = find(pair.get(1));
        }
        //对不同祖宗节点的进行分组
//        Map<Integer, List<Integer>> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            int pa = find(p[i]);
//            if (map.get(pa) == null) {
//                List<Integer> l = new ArrayList<>();
//                l.add(i);
//                map.put(pa, l);
//            } else {
//                map.get(pa).add(i);
//            }
//        }
//        char[] c = s.toCharArray();
//        //对个组进行排序
//        for (Integer key : map.keySet()) {
//            if (map.get(key).size() == 1) {
//                continue;
//            }
//            sort(map.get(key), c);
//        }
//        return String.valueOf(c);

        char[] charArray = s.toCharArray();
        Map<Integer, PriorityQueue<Character>> hashMap = new HashMap<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            int root = find(i);
            if (hashMap.containsKey(root)) {
                hashMap.get(root).offer(charArray[i]);
            } else {
                hashMap.computeIfAbsent(root, key -> new PriorityQueue<>()).offer(charArray[i]);
            }
        }

        // 第 3 步：重组字符串
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int root = find(i);
            stringBuilder.append(hashMap.get(root).poll());
        }
        return stringBuilder.toString();
    }

    public void sort(List<Integer> idxs, char[] arr) {
        for (int i = 0; i < idxs.size() - 1; i++) {
            for (int j = i + 1; j < idxs.size(); j++) {
                if (arr[idxs.get(j)] < arr[idxs.get(i)]) {
                    char c = arr[idxs.get(i)];
                    arr[idxs.get(i)] = arr[idxs.get(j)];
                    arr[idxs.get(j)] = c;
                }
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> s1 = Arrays.asList(0, 3);
        List<Integer> s2 = Arrays.asList(1, 2);

        list.add(s1);
        list.add(s2);
//        List<Integer> s3 = Arrays.asList(0, 2);
//        list.add(s3);
        SmallestStringWithSwaps s = new SmallestStringWithSwaps();

        System.out.println(s.smallestStringWithSwaps("dcab", list));

    }
}


