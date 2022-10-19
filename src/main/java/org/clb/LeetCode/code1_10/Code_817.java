package org.clb.LeetCode.code1_10;

public class Code_817 {
    public int numComponents(ListNode head, int[] nums) {

        return 0;
    }

    public static void main(String[] args) {
        String substring = "CZ202210120001".substring(14, 18);
        System.out.println(substring);
        System.out.println(Integer.parseInt(substring));
    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
