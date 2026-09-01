/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }
        ListNode prev = head;
        ListNode curr = head.next;
        int index = 1;
        int firstCriticalIdx = -1;
        int prevCriticalIdx = -1;
        int minDist = Integer.MAX_VALUE;
        while(curr.next != null){
            boolean isMaxima = curr.val > prev.val && curr.val > curr.next.val;
            boolean isMinima = curr.val < prev.val && curr.val < curr.next.val;

            if (isMaxima || isMinima) {
                if (firstCriticalIdx == -1) {
                    firstCriticalIdx = index;
                } else {
                    minDist = Math.min(minDist, index - prevCriticalIdx);
                }
                prevCriticalIdx = index;
            }
            prev = curr;
            curr = curr.next;
            index++;
        }
        if (minDist == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
            
        }
        int maxDist = prevCriticalIdx - firstCriticalIdx;
        return new int[]{minDist, maxDist};
    }
}