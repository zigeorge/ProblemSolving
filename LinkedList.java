import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class LinkedList {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int extra = 0;
        int sum = sumOfTwoNodes(l1, l2) + extra;
        int nodeVal = sum % 10;
        if (sum > 9)
            extra = 1;
        ListNode head = new ListNode(nodeVal);
        ListNode next = head;
        next.next = getNextNode(l1.next, l2.next, extra);
        return head;
    }

    public ListNode getNextNode(ListNode l1, ListNode l2, int extra) {
        if (l1 == null && l2 == null && extra == 0)
            return null;
        int sum = sumOfTwoNodes(l1, l2) + extra;
        int nodeVal = sum % 10;
        if (sum > 9)
            extra = 1;
        else
            extra = 0;
        // if(sum == 0) return null;
        ListNode nNode = new ListNode(nodeVal);
        if (l1 != null)
            l1 = l1.next;
        if (l2 != null)
            l2 = l2.next;
        nNode.next = getNextNode(l1, l2, extra);
        return nNode;
    }

    public int sumOfTwoNodes(ListNode l1, ListNode l2) {
        if (l1 != null && l2 != null) {
            return l1.val + l2.val;
        } else if (l1 != null && l2 == null) {
            return l1.val;
        } else if (l1 == null && l2 != null) {
            return l2.val;
        } else
            return 0;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next ==  null) {
            return null;
        } else if (head.next.next ==  null) {
            if(n == 1) {
                head.next = null;
            } else if(n == 2) {
                head = head.next;
            }
            return head;
        } else {
            ListNode fp = head.next.next;
            ListNode sp = head;
            head = sp;
            int spPosition = 3;
            while(fp.next != null) {
                if(fp.next.next != null) {
                    fp = fp.next.next;
                    spPosition += 2;
                } else {
                    fp = fp.next;
                    spPosition++;
                }
            }
            // nodeTraversed-=1;
            while(spPosition>n+1) {
                sp = sp.next;
                spPosition--;
            }
            if(spPosition == n) {
                sp.val = sp.next.val;
                sp.next = sp.next.next;
                return head;
            }
            if(sp.next.next != null) {
                sp.next.val = sp.next.next.val;
                sp.next.next = sp.next.next.next;
            } else {
                sp.next = null;
            }
            return head;
        }
    }

    @Test
    public void removeNthFromEnd_returnsExpectedLinkedList() {
        ListNode head = PracticeHome.createLinkedList(new int[] { 1, 2, 3 });
        ListNode result = removeNthFromEnd(head, 3);
        int[] arr = PracticeHome.fromLinkedList(result);
        assertArrayEquals(new int[]{  2, 3 }, arr);
    }

    @Test
    public void addTwoNumbers_ReturnsExpectedLinkedList() {
        ListNode l1 = PracticeHome.createLinkedList(new int[] { 1, 6, 0, 3, 3, 6, 7, 2, 0, 1 });
        ListNode l2 = PracticeHome.createLinkedList(new int[] { 6, 3, 0, 8, 9, 6, 6, 9, 6, 1 });
        ListNode result = addTwoNumbers(l1, l2);
        int[] arr = PracticeHome.fromLinkedList(result);
        assertArrayEquals(new int[] { 7, 9, 0, 1, 3, 3, 4, 2, 7, 2 }, arr);
    }

}
