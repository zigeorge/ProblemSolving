import java.util.ArrayList;

public class PracticeHome {
    public static void main(String[] args) {
        // linkedListOps();
        // int x = 0/2;
        // System.out.println(x);
    }

    public static void linkedListOps() {
        ListNode a = createLinkedList(new int[] { 1, 1, 2, 2, 1, 1 });
        // ListNode b = createLinkedList(new int[] { 2, 3 });
        // disPlayListNode(mergeTwoLists(a, b));
        // disPlayListNode(deleteDuplicates(a));
        System.out.println(isPalindrome(a));
    }

    public static ListNode createLinkedList(int[] arr) {
        if (arr.length > 0) {
            ListNode firstNode = new ListNode(arr[0]);
            ListNode tail = firstNode;
            if (arr.length > 1) {
                int index = 1;
                while (index < arr.length) {
                    ListNode newNode = new ListNode(arr[index]);
                    tail.next = newNode;
                    tail = newNode;
                    index++;
                }
            }
            return firstNode;
        }
        return null;
    }

    public static int[] fromLinkedList(ListNode head) {
        ArrayList<Integer> nodes = new ArrayList<>();
        while(head != null) {
            nodes.add(head.val);
            head = head.next;
        }

        int[] arr = new int[nodes.size()];
        int index = 0;
        for(Integer node: nodes) {
            arr[index++] = node;
        }

        return arr;
    }

    public static void disPlayListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList;
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val <= list2.val) {
            mergedList = new ListNode(list1.val);
            list1 = list1.next;
        } else {
            mergedList = new ListNode(list2.val);
            list2 = list2.next;
        }
        ListNode tail = mergedList;
        ListNode newNode = mergeTwoLists(list1, list2);
        tail.next = newNode;
        tail = newNode;
        return mergedList;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode n1 = headA, n2 = headB;
        while(n1 != n2) {
            if(n1 != null) {
                n1 = n1.next;
            } else n1 = headB;
            if(n2 != null) {
                n2 = n2.next;
            } else n2 = headA;
        }
        return n1;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.next.next == null)
            return new ListNode(head.next.val, new ListNode(head.val));
        return reverseList(head.next.next, new ListNode(head.next.val, new ListNode(head.val)));
    }

    public static ListNode reverseList(ListNode head, ListNode next) {
        if (head.next != null) {
            return reverseList(head.next, new ListNode(head.val, next));
        }
        return new ListNode(head.val, next);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode nNode = head;
        head.next = nNode.next;
        while(nNode != null && nNode.next != null) {
            if(nNode.val == nNode.next.val) {
                nNode.next = nNode.next.next;
            }
            nNode = nNode.next;
        }
        return head;
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode reverseList = null;
        ListNode current = head;
        while(current != null) {
            ListNode lNode = new ListNode(current.val);
            if(reverseList == null) {
                reverseList = lNode;
            } else {
                lNode.next = reverseList;
                reverseList = lNode;
            }
            current = current.next;
        }
        current = head;
        ListNode rCurrent = reverseList;
        while (current != null && rCurrent != null && current.val == rCurrent.val) {
            current = current.next;
            rCurrent = rCurrent.next;
        }
        return current == null;

    }

    public static void swap(int[] nums, int indexA, int indexB) {
        int temp = nums[indexA];
        nums[indexA] = nums[indexB];
        nums[indexB] = temp;
    }
}

// Definition for singly-linked list.
class ListNode {
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