package easy.middleNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    int n = 0;
    ListNode res;

    public ListNode middleNode(ListNode head) {
         middle(0, head);
        return res;
    }

    public ListNode middle(int deep, ListNode node) {
        n++;
        if (node.next == null) {
            res = node;
            return node;
        }
        ListNode ln = middle(deep + 1, node.next);
        if (deep == n / 2) {
            res = node;
            return node;
        } else {
            return node;
        }
    }
}