package leetcode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Q2 {

    public final static void main(String[] args) {
//		ListNode l3 = new ListNode(3, null);
//		ListNode l2 = new ListNode(4, l3);
//		ListNode l1 = new ListNode(2, l2);
//
//		ListNode l6 = new ListNode(4, null);
//		ListNode l5 = new ListNode(6, l6);
//		ListNode l4 = new ListNode(5, l5);

        ListNode l3 = new ListNode(9, null);
        ListNode l2 = new ListNode(9, l3);
        ListNode l1 = new ListNode(9, l2);

        ListNode l7 = new ListNode(9, null);
        ListNode l6 = new ListNode(9, l7);
        ListNode l5 = new ListNode(9, l6);
        ListNode l4 = new ListNode(9, l5);

        ListNode result = Solution.addTwoNumbers(l1, l4);

        while(true) {
            System.out.println(result.getVal());

            if (result.getNext() == null) {
                break;
            }

            result = result.next;
        }
    }

    static class Solution {
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = null;
            ListNode tail = null;
            int carry = 0;
            while(true) {
                if (l1 == null && l2 == null && carry == 0) {
                    break;
                }

                int l1val = l1 == null ? 0 : l1.val;
                int l2val = l2 == null ? 0 : l2.val;
                int l = l1val + l2val + carry;
                carry = l / 10;

                if (tail == null) {
                    head = tail = new ListNode(l % 10);
                } else {
                    ListNode newLn = new ListNode(l % 10);
                    tail.next = newLn;
                    tail = newLn;
                }

                l1 = l1 == null ? null : l1.next;
                l2 = l2 == null ? null : l2.next;
            }

            return head;
        }
    }

}


class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }


}